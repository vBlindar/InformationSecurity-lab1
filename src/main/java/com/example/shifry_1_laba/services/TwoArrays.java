package com.example.shifry_1_laba.services;

import com.example.shifry_1_laba.entity.TwoArraysEncode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface TwoArrays extends Encoder{

    ResponseEntity<String> decodeText(String encoding);

    ResponseEntity<TwoArraysEncode> getEncodeObject(String original);

    String getStringResponseEntity(String encoding, List<String> key, List<String> alphabetKey);

    String getResultText(List<String> result);

    List<String> getInputTextSymbols(String original);
}
