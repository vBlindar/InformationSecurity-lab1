package com.example.shifry_1_laba.controllers;

import com.example.shifry_1_laba.entity.Alphabet;

import com.example.shifry_1_laba.entity.TwoArraysEncode;
import com.example.shifry_1_laba.servisesImpl.ReadFileImpl;
import com.example.shifry_1_laba.servisesImpl.TwoArraysImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {


    private final ReadFileImpl readFile;

    private final TwoArraysImpl twoArrays;

    @GetMapping
    public String getMainPage(Model model){
        Alphabet a = new Alphabet();
        var b = a.getAlphabet().toCharArray();
        List<String> bb = new ArrayList<>();
        for (char c : b) {
            bb.add(String.valueOf(c));
        }
        Collections.shuffle(bb);
        return "index";
    }


    @GetMapping("/encoding")
    public ResponseEntity<TwoArraysEncode> getEncoding(@RequestParam String original){

        return twoArrays.getEncodeObject(original);
    }

    @GetMapping("/update-two-arrays-table")
    public String updateTwoArraysTable(@RequestParam List<String> alphabet, @RequestParam List<String> key, Model model){
        model.addAttribute("alphabet", alphabet);
        model.addAttribute("key", key);

        return "replacement/two-arrays-table";
    }
    @GetMapping("/decoding")
    public ResponseEntity<String> getDecoding(@RequestParam String encoding){
        return twoArrays.decodeText(encoding);
    }

    @PostMapping("/read-file")
    public ResponseEntity<String> readFile(MultipartFile file){

        return  readFile.readFile(file);
    }
}
