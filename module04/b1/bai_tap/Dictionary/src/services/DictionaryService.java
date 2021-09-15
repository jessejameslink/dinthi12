package services;

import models.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryService {
    private static Map<Integer, Dictionary> dictionaryMap =new HashMap<>();

    static {
        dictionaryMap.put(1,new Dictionary("map","bản đồ"));
        dictionaryMap.put(2,new Dictionary("government","chính phủ"));
        dictionaryMap.put(3,new Dictionary("company","công ty"));
        dictionaryMap.put(4,new Dictionary("department","phòng"));
        dictionaryMap.put(5,new Dictionary("director ","giám đốc"));
        dictionaryMap.put(6,new Dictionary("hi","xin chào"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
