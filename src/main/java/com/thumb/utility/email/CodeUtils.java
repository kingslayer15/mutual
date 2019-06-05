package com.thumb.utility.email;

import java.util.Random;
import java.util.UUID;

public class CodeUtils {
    //生成唯一的激活码
    public String generateUniqueCode(){
        Random random = new Random();
        String code = random.nextInt(900000)+100001+"";
        return code;
    }
}
