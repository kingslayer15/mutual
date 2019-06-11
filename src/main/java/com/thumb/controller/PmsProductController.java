package com.thumb.controller;

import com.thumb.pojo.PmsProduct;
import com.thumb.pojo.PmsProductCategory;
import com.thumb.pojo.PmsSkuStock;
import com.thumb.service.PmsProductCategoryService;
import com.thumb.service.PmsProductService;
import com.thumb.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
public class PmsProductController {
    @Autowired
    PmsProductService pmsProductService;
    @Autowired
    PmsProductCategoryService pmsProductCategoryService;
    /**
     * 更具商品id存进cookie
     * @param id
     * @param request
     * @param response
     * @param httpSession
     */
    @RequestMapping("saveCookies")
    @ResponseBody
    public void getpid(@RequestParam String id, HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) {
        //首页点了商品的id
        System.out.println(id);

//        String pid1=request.getParameter("pid");
        //转long
//        Long pid = Long.valueOf(id);
        //根据id找商品
//        PmsProduct pmsProduct= pmsProductService.selectByPrimaryKey(pid);
//        PmsProductCategory pmsProductCategory= pmsProductCategoryService.selectByPrimaryKey(pmsProduct.getProductCategoryId());
//        pmsProduct.setPmsProductCategory(pmsProductCategory);
//        httpSession.setAttribute("pmsProduct", pmsProduct);

//        request.setAttribute("pmsProduct", pmsProduct);
        //long转string
//        String id=id+"";
        //初始化
        String cookiepids=id;
        //将pid放入cookie中
        Cookie[] cookies=  request.getCookies();
        if(cookies!=null){
            for(Cookie cookie: cookies){
                if("pids".equals(cookie.getName())){
                    //将值 3-2-8存放
                    cookiepids=cookie.getValue();
                    String [] split= cookiepids.split("-");
                    List<String> aslist= Arrays.asList(split);
                    LinkedList<String> list=new LinkedList<String>(aslist);
                    System.out.println("集合"+list);
                    if(list.contains(id)){
                        list.remove(id);
                        list.addFirst(id);
                    }else{
                        list.addFirst(id);
                        if (list.size() >9) {
                           list.removeLast();
                        }
                    }
                    //放进sb里面
                    StringBuffer sb=new StringBuffer();
                    for(int i=0;i<list.size();i++){
                        sb.append(list.get(i)).append("-");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    cookiepids=sb.toString();
                    System.out.println(cookiepids);
                }

            }
        }
        //如果没有cookie,把id放进cookie里面
        Cookie  cookie=new Cookie("pids", cookiepids);
        response.addCookie(cookie);
//        try {
//            request.getRequestDispatcher("product_info.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @RequestMapping("pmsProductOfHistoryList")
    @ResponseBody
    public Object historyList(HttpSession httpSession,HttpServletRequest request,HttpServletResponse response) {
    //浏览记录
        List<PmsProduct> historyList=new ArrayList<PmsProduct>();
        //去拿cookie
        Cookie [] cookies=request.getCookies();
        if(cookies!=null){
            for(Cookie cookie : cookies){
                if("pids".equals(cookie.getName())){
                    String pids=cookie.getValue();
                    System.out.println("cookie里面的"+pids);
                    String [] splits=pids.split("-");
                    for (int i = 0; i < splits.length; i++) {
                        String pid=splits[i];
                        System.out.println("遍历"+pid);
                        //把cookie的id拿出来,查询返回给产品对象
                        PmsProduct pmsProduct= pmsProductService.selectByPrimaryKey(Long.valueOf(pid));
                        //把产品对象加入到对象集合
                        historyList.add(pmsProduct);
                    }
                }
            }
        }
//
//        System.out.println(historyList);
//        request.setAttribute("historyList",historyList);
        //返回对象集合
        return historyList;


    }


    @RequestMapping("getProductDetailsById")
    @ResponseBody
    public Object getProductDetailsById(@RequestParam String id) {
        System.out.println(id);
        Long pid = Long.valueOf(id);
        PmsProduct pmsProduct = pmsProductService.selectByPrimaryKey(pid);
        System.out.println(pmsProduct);
        if (pmsProduct != null) {
            System.out.println("pmsProduct = " + pmsProduct);
            return pmsProduct;
        }
        return false;

    }
    @RequestMapping("getColorById")
    @ResponseBody
    public Object getColorById(@RequestParam String id) {
        System.out.println(id);
        Long pid = Long.valueOf(id);
        List<PmsProduct> pmsProduct = pmsProductService.getColorById(pid);
        System.out.println(pmsProduct);
        if (pmsProduct != null) {
            System.out.println(pmsProduct);
            return pmsProduct;
        }
        return false;

    }

//    @RequestMapping("getColorBySelectedRomAndId")
//    @ResponseBody
//    public Object getColorBySelectedRomAndId(@RequestBody String id) {
//        System.out.println(id);
//        Long pid = Long.valueOf(id);
//        PmsProduct pmsProduct = pmsProductService.selectOneById(pid);
//        System.out.println(pmsProduct);
//        if (pmsProduct != null) {
//            System.out.println(pmsProduct);
//            return pmsProduct;
//        }
//        return false;
//
//    }
}
