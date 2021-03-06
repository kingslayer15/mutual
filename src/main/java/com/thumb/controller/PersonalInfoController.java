package com.thumb.controller;

import com.thumb.dto.UserInfoDto;
import com.thumb.entity.pojo.UmsMember;
import com.thumb.service.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

@Controller
public class PersonalInfoController {

    @Autowired

    PersonalInfoService personalInfoService;


    @ResponseBody
    @RequestMapping("userInfoById")
    public Object userInfoById(HttpServletRequest httpServletRequest,@RequestParam("userId") int uid){
        System.out.println(uid);
        //此处自己设置了用户id，合并时需调整
//        httpServletRequest.getSession().setAttribute("userId",Uid);
//        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
//        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
        httpServletRequest.getSession().setAttribute("userId",uid);
//        int uid1 = (int) httpServletRequest.getSession().getAttribute("uid");
//        System.out.println(uid1+"存入后");
//        int Uid = umsMember.getId().intValue();
//        String userId = (String) httpServletRequest.getSession().getAttribute("userId");
        System.out.println("用户id"+uid);
//        int uid=Integer.parseInt();
//        System.out.println(Uid);
        System.out.println(personalInfoService.userInfoById(uid));
        return personalInfoService.userInfoById(uid);

    }

    @ResponseBody
    @RequestMapping("userInfoById_")
    public Object userInfoById_(HttpServletRequest httpServletRequest){
        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());

        System.out.println("ID===="+ uId);
//        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
//        int uid = umsMember.getId().intValue();
//        System.out.println(uid);
        System.out.println(personalInfoService.userInfoById(uId));
        return personalInfoService.userInfoById(uId);
    }


    @RequestMapping("iconUpload")
    public String fileUplaod(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest httpServletRequest) throws IOException {
        System.out.println("fileName: "+file.getOriginalFilename());
        //创建头像存储文件夹
        String filepath=httpServletRequest.getSession().getServletContext().getRealPath("/userIcon");
        File destFile = new File(filepath);
        if (!destFile.exists()) {
            destFile.mkdirs();
        }
        String fileName=new Date().getTime()+file.getOriginalFilename();
        destFile = new File(filepath, fileName);
        System.out.println(destFile.getAbsolutePath());
        file.transferTo(destFile);

//        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
//        int uId = umsMember.getId().intValue();

        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setIcon(fileName);
        userInfoDto.setId(BigInteger.valueOf(uId));
        int i=personalInfoService.iconUpdate(userInfoDto);
        System.out.println(i);
        if (i!=0){
            return "main/self_info_edit";
        }
        return "main/self_info_edit";
    }



    @ResponseBody
    @RequestMapping("updateInfo")
    public Boolean updateInfo(@RequestBody UserInfoDto userInfoDto){
//        int uId = Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString());
//        userInfoDto.setId(BigInteger.valueOf(uId));
        System.out.println("update   "+userInfoDto);
        int i = personalInfoService.updateInfo(userInfoDto);
        System.out.println("update result: "+i);
        if (i!=0) {
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("pwdCheck")
    public boolean pwdCheck(@RequestBody UserInfoDto userInfoDto,HttpServletRequest httpServletRequest){
        BigInteger uId =BigInteger.valueOf( Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString()));
//        UmsMember umsMember = (UmsMember) httpServletRequest.getSession().getAttribute("umsMember");
//        int uid = umsMember.getId().intValue();
//        BigInteger uId=BigInteger.valueOf(uid);
        userInfoDto.setId(uId);
        UserInfoDto check = personalInfoService.check(userInfoDto);
        if (check!=null){
            int i=personalInfoService.pwdUpdate(userInfoDto);
            if (i!=0){
                return true;
            }
        }
        return false;
    }

//    @ResponseBody
//    @RequestMapping("updatePwd")
//    public boolean updatePwd(@RequestBody UserInfoDto userInfoDto,HttpServletRequest httpServletRequest){
//        BigInteger uId =BigInteger.valueOf( Integer.parseInt(httpServletRequest.getSession().getAttribute("userId").toString()));
//        userInfoDto.setId(uId);
//        int i=personalInfoService.pwdUpdate(userInfoDto);
//        System.out.println("密码修改"+i);
//        if (i!=0){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
