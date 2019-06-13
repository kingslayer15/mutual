package com.thumb.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.thumb.dto.*;
import com.thumb.entity.pojo.UmsMember;
import com.thumb.service.PersonalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
public class PersonalOrderController {
    @Autowired
    PersonalOrderService personalOrderService;
    List<String> list;

//总订单数查询分页
    @ResponseBody
    @RequestMapping("orderByUid")
    public Object orderByUid(HttpServletRequest httpServletRequest,@RequestBody OrderPageDto orderPageDto){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        orderPageDto.setUid(uId);
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid(orderPageDto);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }
//总订单个数
    @ResponseBody
    @RequestMapping("count")
    public Object count(HttpServletRequest httpServletRequest){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        int count = personalOrderService.count(uId);
        System.out.println(count);
        return count;
    }

    @ResponseBody
    @RequestMapping("orderByUid0")
    public Object orderByUid0(HttpServletRequest httpServletRequest,@RequestBody OrderPageDto orderPageDto){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        orderPageDto.setUid(uId);
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid0(orderPageDto);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }

    @ResponseBody
    @RequestMapping("count0")
    public Object count0(HttpServletRequest httpServletRequest){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        int count = personalOrderService.count0(uId);
        System.out.println(count);
        return count;
    }

    @ResponseBody
    @RequestMapping("orderByUid1")
    public Object orderByUid1(HttpServletRequest httpServletRequest,@RequestBody OrderPageDto orderPageDto){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        orderPageDto.setUid(uId);
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid1(orderPageDto);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }


    @ResponseBody
    @RequestMapping("count1")
    public Object count1(HttpServletRequest httpServletRequest){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        int count = personalOrderService.count1(uId);
        System.out.println(count);
        return count;
    }

    @ResponseBody
    @RequestMapping("orderByUid2")
    public Object orderByUid2(HttpServletRequest httpServletRequest,@RequestBody OrderPageDto orderPageDto){
        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        orderPageDto.setUid(uId);
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid2(orderPageDto);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }

    @ResponseBody
    @RequestMapping("count2")
    public Object count2(HttpServletRequest httpServletRequest){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        int count = personalOrderService.count2(uId);
        System.out.println(count);
        return count;
    }

    @ResponseBody
    @RequestMapping("orderByUid3")
    public Object orderByUid3(HttpServletRequest httpServletRequest,@RequestBody OrderPageDto orderPageDto){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
        orderPageDto.setUid(uId);
        List<ClientOrderDto> clientOrderDtos = personalOrderService.orderByUid3(orderPageDto);
        System.out.println(clientOrderDtos);
        return clientOrderDtos;
    }

    @ResponseBody
    @RequestMapping("count3")
    public Object count3(HttpServletRequest httpServletRequest){
        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("UmsMember");
        int uId = umsMember.getId().intValue();
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        int count = personalOrderService.count3(uId);
        System.out.println(count);
        return count;
    }



    @ResponseBody
    @RequestMapping("changeStatus")
    public boolean changeStatus(@RequestParam("id") int product_id){
        int i=personalOrderService.changeStatus(product_id);
        if (i!=0){
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("getreasons")
    public Object getreasons(){
        return personalOrderService.getreasons();
    }

    @ResponseBody
    @RequestMapping("getRefundProduct")
    public Object getRefundProduct(@RequestParam("id") int product_id){
        System.out.println(product_id);
        System.out.println(personalOrderService.getRefundProduct(product_id));
        return personalOrderService.getRefundProduct(product_id);
    }

    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) {
        System.out.println("inner upload");
        System.out.println(dropzFile);
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取上传的原始文件名
        String fileName = dropzFile.getOriginalFilename();
        // 设置文件上传路径
        String filePath = request.getSession().getServletContext().getRealPath("/upload");
        // 获取文件后缀
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());

        // 判断并创建上传用的文件夹
        File destFile = new File(filePath);
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        // 重新设置文件名为 UUID，以确保唯一
        destFile = new File(filePath, UUID.randomUUID() + fileSuffix);
        System.out.println(destFile.getAbsolutePath());
        if(!destFile.exists()){
            try {
                destFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(destFile.getAbsolutePath()+"-------");
        try {
            // 写入文件
            dropzFile.transferTo(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回 JSON 数据，这里只带入了文件名
        request.getSession().setAttribute("refund_pic",destFile.getName());
        list=new ArrayList<>();
        list.add(destFile.getName());
        System.out.println(list);
        result.put("fileName", destFile.getName());
        return result;
    }


    @ResponseBody
    @RequestMapping("refundText")
    public boolean refundText(HttpServletRequest request, @RequestBody ClientRefundDto clientRefundDto){
//    public boolean refundText(@RequestParam("itemId") int itemId,@RequestParam("value") int returnamount,@RequestParam("description") String description,@RequestParam("id") int uid,HttpServletRequest request,@RequestParam("reason") String reason){
        System.out.println("退货申请");
        String pic = (String) request.getSession().getAttribute("refund_pic");
        clientRefundDto.setProof_pics(pic);
        boolean i=personalOrderService.addRefundAppply(clientRefundDto);
        if (i){
            return true;
        }
        return false;
    }


    //评价图片
    @ResponseBody
    @RequestMapping(value = "rate", method = RequestMethod.POST)
    public Map<String, Object> rate(MultipartFile dropzFile, HttpServletRequest request) {
        System.out.println("inner upload");
        System.out.println(dropzFile);
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取上传的原始文件名
        String fileName = dropzFile.getOriginalFilename();
        // 设置文件上传路径
        String filePath = request.getSession().getServletContext().getRealPath("/rate");
        // 获取文件后缀
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());

        // 判断并创建上传用的文件夹
        File destFile = new File(filePath);
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        // 重新设置文件名为 UUID，以确保唯一
        destFile = new File(filePath, UUID.randomUUID() + fileSuffix);
        System.out.println(destFile.getAbsolutePath());
        if(!destFile.exists()){
            try {
                destFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(destFile.getAbsolutePath()+"-------");
        try {
            // 写入文件
            dropzFile.transferTo(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回 JSON 数据，这里只带入了文件名
        request.getSession().setAttribute("rate_pic",destFile.getName());
        list=new ArrayList<>();
        list.add(destFile.getName());
        System.out.println(list);
        result.put("fileName", destFile.getName());
        return result;
    }

    //提交评价
    @ResponseBody
    @RequestMapping("addRate")
    public boolean addRate(HttpServletRequest request,@RequestBody RateDto rateDto){
        String pic = (String) request.getSession().getAttribute("rate_pic");
        rateDto.setPics(pic);
        int i=personalOrderService.addRate(rateDto);
        if (i!=0){
            return true;
        }
        return false;
    }


}
