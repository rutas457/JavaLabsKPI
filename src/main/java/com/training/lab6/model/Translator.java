package com.training.lab6.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Translator {

    HashMap<String, String> dict = new HashMap<>();

    public Translator(HashMap<String, String> dict) {
        this.dict = dict;
    }

    public Translator() {
    }

    public void add(String lang1, String lang2) {
        dict.put(lang1, lang2);
    }

    public String translate_word(String word) {
        return dict.getOrDefault(word, word);
    }

    public String translate(String text) {
        ArrayList<String> out = new ArrayList<>();
        for (String word: text.split(" ")) {
            out.add(translate_word(word));
        }
        return String.join(" ", out);
    }

}
