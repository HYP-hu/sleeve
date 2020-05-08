package com.lin.missyou.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lin.missyou.exception.http.ServerErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenericAndJson {

    private static ObjectMapper mapper;

    @Autowired
    public void setMapper(ObjectMapper mapper){
        GenericAndJson.mapper = mapper;
    }

    public static <T> String ObjectToJson(T o){
        try {
            if (o == null){
                return null;
            }
            return mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ServerErrorException(9999);
        }
    }

    public static<T> T jsonToObject(String s, Class<T> classT){
        if (s == null){
            return null;
        }
        try {
            return GenericAndJson.mapper.readValue(s, classT);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ServerErrorException(9999);
        }
    }
    // List<T> 泛型 T      List<S> S是泛型
    @SuppressWarnings("unchecked")
    public static <T> List<T> jsonToList(String s){
        if (s == null){
            return null;
        }
        try {
//            List<T> list = GenericAndJson.mapper.readValue(s, new TypeReference<List<T>>(){});
            List<T> list = GenericAndJson.mapper.readValue(s, List.class);
            return list;
//            return GenericAndJson.mapper.readValue(s, List.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ServerErrorException(9999);
        }

    }

    public static <T> T jsonToList(String s, TypeReference<T> tr){
        if (s == null){
            return null;
        }
        try {
            T t = GenericAndJson.mapper.readValue(s, tr);
            return t;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ServerErrorException(9999);
        }
    }

}
