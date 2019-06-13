package com.thumb.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
public class EchartsDto {
    List<String> date;
    List<String> count;
}
