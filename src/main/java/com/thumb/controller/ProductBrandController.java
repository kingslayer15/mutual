package com.thumb.controller;


import com.github.pagehelper.PageInfo;
import com.thumb.dto.ProductBrandDto;
import com.thumb.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class ProductBrandController {
    @Autowired
    ProductBrandService productBrandService;

    /**
     * 分页查找所有品牌
     * @param pageNo
     * @return
     */
    @ResponseBody
    @RequestMapping("listAllBrand")
    public Object listAllBrand(@RequestParam(defaultValue = "1",required = true,value = "pageNo") Integer pageNo){

        //最大显示行数数
        int maxShow = 8;

        PageInfo<ProductBrandDto> productBrandDto = productBrandService.listAllBrand(pageNo, maxShow);

        return productBrandDto;
    }


    /**
     * 根据条件查询品牌
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping("findBrandByCondition")
    public Object findByCondition(@RequestBody Map<String,Object> params){

        //获取传过来的字符串
        String condition = params.get("condition").toString();

        System.out.println("根据条件查询品牌");
        List<ProductBrandDto> productBrandDtos = productBrandService.findByCondition(condition);
        return productBrandDtos;
    }

    /**
     * 根据品牌id查找信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("findBrandById")
    public Object findBrandById(@RequestParam int id){
        ProductBrandDto productBrandDto = productBrandService.findBrandById(id);
        return productBrandDto;
    }


    /**
     * 修改品牌信息
     * @param productBrandDto
     * @return
     */
    @ResponseBody
    @RequestMapping("updateBrand")
    public Object updateBrand(@RequestBody ProductBrandDto productBrandDto){
        String logo = productBrandDto.getLogo();
        productBrandDto.setLogo("http://localhost:8080/static/upload/"+logo);
        int i = productBrandService.updateBrand(productBrandDto);
        return i;
    }

    /**
     * 添加品牌信息
     * @param productBrandDto
     * @return
     */
    @ResponseBody
    @RequestMapping("addBrand")
    public Object addBrand(@RequestBody ProductBrandDto productBrandDto){

        String logo = productBrandDto.getLogo();
        if (logo.length()>0){
            productBrandDto.setLogo("http://localhost:8080/static/upload/"+logo);
        }
        int i = productBrandService.addBrand(productBrandDto);
        return i;
    }

    /**
     * 根据id删除品牌信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteBrandById")
    public Object deleteBrandById(@RequestParam int id){
        int i = productBrandService.deleteBrandById(id);
        return i;
    }

    /**
     * 图片上传
     * @param dropzFile
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "upload")
    public Map<String,Object> upload(MultipartFile dropzFile, HttpServletRequest request){
        System.out.println(dropzFile);
        Map<String,Object> result=new HashMap<String, Object>();
        //获取上传的文件名
        String fileName=dropzFile.getOriginalFilename();
        //设置文件上传路径
        String filePath=request.getSession().getServletContext().getRealPath("/static/upload");
        //获取文件的后缀名
        String fileSuffix=fileName.substring(fileName.lastIndexOf("."),fileName.length());
        //判断并创建上传文件夹
        File file=new File(filePath);
        if(!file.exists()){
            file.mkdirs();
        }
        //重新设置文件名为UUID
        file=new File(filePath, UUID.randomUUID()+fileSuffix);
        System.out.println(file.getAbsoluteFile());
        if(!file.exists()){
            try {
                file.createNewFile();
                //写入文件
                dropzFile.transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 返回 JSON 数据，这里只带入了文件名
        result.put("fileName",file.getName());
        return result;
    }
}
