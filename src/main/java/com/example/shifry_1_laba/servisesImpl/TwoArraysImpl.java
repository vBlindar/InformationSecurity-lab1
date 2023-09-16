package com.example.shifry_1_laba.servisesImpl;

import com.example.shifry_1_laba.entity.Alphabet;
import com.example.shifry_1_laba.services.TwoArrays;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TwoArraysImpl implements TwoArrays {

    private Alphabet alphabet;

    private List<String> key;
    @Override
    public List<String> encodeText() {


        return null;
    }



    @Override
    public List<String> getNewKey(List<String> alphabet) {
        Collections.shuffle(alphabet);
        return alphabet;
    }


}
