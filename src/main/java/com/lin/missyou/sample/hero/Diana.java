package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Diana implements ISkill {
    private String name;
    private Integer age;
    public Diana(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Diana(){
        System.out.println("Hello, Diana");
    }

    @Override
    public void q() {
        System.out.println("Diana Q");
    }

    @Override
    public void w() {
        System.out.println("Diana W");
    }

    @Override
    public void e() {
        System.out.println("Diana E");
    }

    @Override
    public void r() {
        System.out.println("Diana R");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
