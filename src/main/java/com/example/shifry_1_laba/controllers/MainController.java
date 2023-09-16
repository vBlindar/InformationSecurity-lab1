package com.example.shifry_1_laba.controllers;

import com.example.shifry_1_laba.entity.Alphabet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {


    @GetMapping
    public String getMainPage(Model model){
        Alphabet a = new Alphabet();

        var b = a.getAlphabet().toCharArray();

        List<String> bb = new ArrayList<>();

        for (char c : b) {
            bb.add(String.valueOf(c));
        }
        Collections.shuffle(bb);
        bb.forEach(System.out::print);
        System.out.println();
        System.out.println(bb.size());
        return "index";
    }
}
