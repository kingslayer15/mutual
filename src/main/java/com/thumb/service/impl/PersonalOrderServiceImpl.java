package com.thumb.service.impl;

import com.thumb.dto.*;
import com.thumb.mapper.PersonalOrderMapper;
import com.thumb.service.PersonalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class PersonalOrderServiceImpl implements PersonalOrderService {
    @Autowired
    PersonalOrderMapper personalOrderMapper;



    @Override
    public List<ClientOrderDto> orderByUid(int uid) {
        return personalOrderMapper.orderByUid(uid);
    }

    @Override
    public int changeStatus(int product_id) {
        return personalOrderMapper.changeStatus(product_id);
    }

    @Override
    public Client_order_itemDto getRefundProduct(int product_id) {
        return personalOrderMapper.getRefundProduct(product_id);
    }

    @Override
    public boolean addRefundAppply(ClientRefundDto clientRefundDto) {
        //获取退货物品信息
        ClientRefundDto returnInfo = personalOrderMapper.getReturnInfo(clientRefundDto.getId());
        returnInfo.setReturn_amount(BigDecimal.valueOf(clientRefundDto.getProduct_count()).multiply(returnInfo.getProduct_real_price()));
        returnInfo.setStatus(0);
        returnInfo.setProduct_count(clientRefundDto.getProduct_count());
        returnInfo.setDescription(clientRefundDto.getDescription());
        returnInfo.setProof_pics(clientRefundDto.getProof_pics());
        returnInfo.setReason(clientRefundDto.getReason());
        int i=personalOrderMapper.addReturnAapply(returnInfo);
        if (i!=0){
            return true;
        }
        return false;
    }

    @Override
    public List<RefundReasonsDto> getreasons() {
        return personalOrderMapper.getreasons();
    }

    @Override
    public int addRate(RateDto rateDto) {
        return personalOrderMapper.addRate(rateDto);
    }

    @Override
    public List<ClientOrderDto> orderByUid0(int uId) {
        return personalOrderMapper.orderByUid0(uId);
    }

    @Override
    public List<ClientOrderDto> orderByUid1(int uId) {
        return personalOrderMapper.orderByUid1(uId);
    }

    @Override
    public List<ClientOrderDto> orderByUid2(int uId) {
        return personalOrderMapper.orderByUid2(uId);
    }

    @Override
    public List<ClientOrderDto> orderByUid3(int uId) {
        return personalOrderMapper.orderByUid3(uId);
    }
}
