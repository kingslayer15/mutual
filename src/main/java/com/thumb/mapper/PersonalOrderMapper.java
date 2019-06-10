package com.thumb.mapper;

import com.thumb.dto.ClientOrderDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PersonalOrderMapper {
    List<ClientOrderDto> orderByUid(int uid);

    int changeStatus(int product_id);
}
