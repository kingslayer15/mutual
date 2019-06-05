package com.thumb.service.impl;

import com.thumb.dto.UmsMemberDto;
import com.thumb.utility.MD5Utils;
import com.thumb.utility.email.CodeUtils;
import com.thumb.utility.email.SendEmailUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.servlet.http.HttpSession;

import com.thumb.mapper.UmsMemberMapper;
import com.thumb.pojo.UmsMember;
import com.thumb.service.UmsMemberService;

import java.io.IOException;

@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return umsMemberMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(UmsMember record) {
        record.setPassword(MD5Utils.myEncode(record.getPassword()));
        int i = umsMemberMapper.insert(record);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int insertSelective(UmsMember record) {
        return umsMemberMapper.insertSelective(record);
    }

    @Override
    public UmsMember selectByPrimaryKey(Long id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UmsMember record) {
        return umsMemberMapper.updateByPrimaryKey(record);
    }

    @Override
    public void sendEmail(String regEmail) {

        String toEmail=regEmail;
        String code = null;
        CodeUtils codeUtils = new CodeUtils();
        code = codeUtils.generateUniqueCode();


        System.out.println(code);
        try {
            SendEmailUtil.send_email(toEmail, code);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    public boolean insertReg(UmsMemberDto umsMemberDto) {
        umsMemberDto.setPassword(MD5Utils.myEncode(umsMemberDto.getPassword()));
        int i = umsMemberMapper.insertReg(umsMemberDto);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
