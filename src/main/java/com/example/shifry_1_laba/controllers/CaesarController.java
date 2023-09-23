package com.example.shifry_1_laba.controllers;

import com.example.shifry_1_laba.entity.TwoArraysEncode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/caesar")
public class CaesarController {



    @GetMapping("/encoding")
    public ResponseEntity<TwoArraysEncode> caesarEncoding(){


        return null;
    }
}
