package com.lin.missyou.sample.hero;


import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//@Component
public class Irelia implements ISkill {
    public Irelia(){
        System.out.println("Hello, Irelia");
    }

    @Override
    public void q() {
        System.out.println("Irelia Q");
    }

    @Override
    public void w() {
        System.out.println("Irelia W");
    }

    @Override
    public void e() {
        System.out.println("Irelia E");
    }

    @Override
    public void r() {
        System.out.println("Irelia R");
    }
}
