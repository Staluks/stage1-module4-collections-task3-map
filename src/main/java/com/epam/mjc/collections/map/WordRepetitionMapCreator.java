package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> stringCount = new HashMap<>();
        StringTokenizer st = new StringTokenizer(sentence, " .,");
        List<String> stringList = new ArrayList<>();
        while (st.hasMoreTokens()){
            String word = st.nextToken().toLowerCase();
            stringList.add(word);
        }
        for(String i : stringList){
            int count = 0;
            for(String a: stringList){
                if(a.toLowerCase().equals(i)){
                    count++;
                }
            }
            stringCount.put(i, count);
        }
        return stringCount;
    }
}
