package com.example.shifry_1_laba.servisesImpl;

import com.example.shifry_1_laba.entity.Alphabet;
import com.example.shifry_1_laba.entity.TwoArraysEncode;
import com.example.shifry_1_laba.services.Caesar;
import com.example.shifry_1_laba.services.Encoder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CaesarImpl implements Caesar {


    private int key;
    private List<String> alphabet = new ArrayList<>();

    @Override
    public ResponseEntity<String> decodeText(String encoding) {
        return null;
    }

    @Override
    public ResponseEntity<TwoArraysEncode> getEncodeObject(String original,int key) {
        Alphabet alphabet = new Alphabet();
        this.alphabet = alphabet.getAlphabetList();
        this.key = key;

        return null;
    }

    private List<String> encodeAlphabet(int key) {
        for (int i = 0; i < 33; i++) {

        }

        return null;
    }

    @Override
    public String getStringResponseEntity(String encoding, List<String> key, List<String> alphabetKey) {
        return null;
    }

    @Override
    public String getResultText(List<String> result) {
        return null;
    }

    @Override
    public List<String> getInputTextSymbols(String original) {
        return null;
    }
}
