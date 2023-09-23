package com.example.shifry_1_laba.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Caesar {

    private final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private int key;

    public Caesar(int key){
     this.key=key;
    }

    public String encoding(String input){
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            var chLW = Character.toLowerCase(ch);
            int index = alphabet.indexOf(ch);
            if (index != -1) {

                if (Character.isUpperCase(ch)) {
                    chLW = Character.toUpperCase(chLW);
                }
                var newIndex = (index + key) % alphabet.length();
                var newChar = alphabet.indexOf(newIndex);
                System.out.println(ch +" "+index+" -- "+ newChar + " "+ newIndex);
                output.append(alphabet.indexOf((index + key) % alphabet.length()));
            } else {
                output.append(chLW);
            }
        }

        return output.toString();
    }

    public List<String> getAlphabetList(){
        List<String> list = new ArrayList<>();
        for (char c : alphabet.toCharArray()) {
            list.add(String.valueOf(c));
        }
        return list;
    }
}
