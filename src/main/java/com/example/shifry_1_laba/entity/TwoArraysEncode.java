package com.example.shifry_1_laba.entity;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TwoArraysEncode {

    private String encodeText;
    private List<String> alphabet;
    private List<String> key;


}
