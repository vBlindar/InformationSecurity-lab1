package com.example.shifry_1_laba.services;

import com.example.shifry_1_laba.entity.TwoArraysEncode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface Caesar extends Encoder{

    ResponseEntity<TwoArraysEncode> getEncodeObject(String original, int key);

}
