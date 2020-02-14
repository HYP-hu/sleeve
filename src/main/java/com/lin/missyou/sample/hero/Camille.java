package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;

public class Camille implements ISkill {
    private String skillName = "Camille R";
    private String name;
    private Integer age;

    public Camille(){
        System.out.println("Hello, Camille");
    }

    public Camille(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void q() {
        System.out.println("Camille Q");
    }

    @Override
    public void w() {
        System.out.println("Camille W");
    }

    @Override
    public void e() {
        System.out.println("Camille E");
    }

    @Override
    public void r() {
        System.out.println("Camille R");
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

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
