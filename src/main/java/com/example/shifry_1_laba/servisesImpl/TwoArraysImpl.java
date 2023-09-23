package com.example.shifry_1_laba.servisesImpl;

import com.example.shifry_1_laba.entity.Alphabet;
import com.example.shifry_1_laba.entity.TwoArraysEncode;
import com.example.shifry_1_laba.services.Encoder;
import com.example.shifry_1_laba.services.TwoArrays;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TwoArraysImpl implements TwoArrays {

    private List<String> key = new ArrayList<>();
    private List<String> alphabetKey = new ArrayList<>();

    @Override
    public ResponseEntity<TwoArraysEncode> getEncodeObject(String original){
        Alphabet alphabet = new Alphabet();
        alphabetKey = alphabet.getAlphabetList();
        key = alphabet.getShuffleList();

        var result = getStringResponseEntity(original, alphabetKey, key);

        var object = TwoArraysEncode.builder()
                .encodeText(result)
                .alphabet(alphabetKey)
                .key(key)
                .build();

        return ResponseEntity.ok(object);
    }


    @Override
    public ResponseEntity<String> decodeText(String encoding) {
        return  ResponseEntity.ok(getStringResponseEntity(encoding, key, alphabetKey));
    }

    @Override
    public String getStringResponseEntity(String encoding, List<String> key, List<String> alphabetKey) {
        List<String> result = new ArrayList<>();
        for (String s : getInputTextSymbols(encoding)) {
            String lowercaseS = s.toLowerCase();
            int index = key.indexOf(lowercaseS);
            if (index != -1 && index < alphabetKey.size()) {
                String encodedChar = alphabetKey.get(index);
                if (Character.isUpperCase(s.charAt(0))) {
                    encodedChar = encodedChar.toUpperCase();
                }
                result.add(encodedChar);
            } else {
                result.add(s);
            }
        }
        return getResultText(result);
    }

    @Override
    public String getResultText(List<String> result) {
        return String.join("", result);
    }

    @Override
    public List<String> getInputTextSymbols(String original) {
        List<String> originalSymbolList = new ArrayList<>();

        for (int i = 0; i < original.length(); i++) {
            originalSymbolList.add(String.valueOf(original.charAt(i)));
        }
        return originalSymbolList;
    }




}
