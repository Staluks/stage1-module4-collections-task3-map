package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapping = new HashMap<>();

        for(Map.Entry<Integer, String> e : sourceMap.entrySet()){
            if(swapping.containsKey(e.getValue()) && e.getKey()>swapping.get(e.getValue())){

            }
            else {
                swapping.put(e.getValue(), e.getKey());
            }
        }
        return swapping;
    }
}
