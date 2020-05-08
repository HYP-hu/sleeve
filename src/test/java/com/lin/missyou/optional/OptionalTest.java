package com.lin.missyou.optional;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptional(){
        Optional<String> empty = Optional.empty();
//        empty.get();
        Optional<String> t1 = Optional.of("123456");
        ArrayList<String> ta = new ArrayList<>();
        ta.add("hello world");
        Optional<List<String>> t2 = Optional.of(ta);
        Optional<String> t3 = Optional.ofNullable(null);
        System.out.println(t1.get());
        t1.ifPresent(System.out::println);
        // orElseThrow
        // orElse
        // orElseGet()

//        t3.get();
        System.out.println(t2.get());

        String t4 = t1.orElse("默认值");
        System.out.println(t4);
        System.out.println("-----------");
        // 生产者 supplier 有返回值
        String t_1 = t1.orElseGet(String::new);
        System.out.println(t_1);
        t1.orElseGet(() -> "默认值");
        // 和lambda表达有关系的是 consumer supplier runnable function predicate
        Optional<String> t5 = Optional.empty();
        // map 既有输入值也有输出值
        String t_2 = t5.map(t -> t + "b").orElse("c");
        System.out.println(t_2);
        // ifPresent 消费者 有输入值
        t1.map(t -> t + "b").ifPresent(System.out::println);
        // filter 消费者 返回值为布尔值
        t1.filter(t -> true).ifPresent(System.out::println);

        // get方法可以预防空指针的产生


    }
}
