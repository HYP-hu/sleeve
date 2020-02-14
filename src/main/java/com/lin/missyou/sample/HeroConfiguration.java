package com.lin.missyou.sample;

import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.sample.condition.IreliaCondition;
import com.lin.missyou.sample.hero.Camille;
import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

    // Configuration的一个基本用法
//    @Value("${spring.hero.name}")
//    private String name;
//
//    @Value("${spring.hero.age}")
//    private Integer age;
//    @Bean
//    public ISkill camille(){
//        return new Camille(name, age);
//    }

    @Bean
    @Conditional(IreliaCondition.class)
//    @ConditionalOnBean(name="mysql")
//    @ConditionalOnProperty(value="hero.condition", havingValue="irelia", matchIfMissing = true)
    public ISkill irelia(){
        return new Irelia();
    }


//    @Bean
////    @Conditional(DianaCondition.class)
//    @ConditionalOnProperty(value="hero.condition", havingValue="diana")
//    public ISkill diana(){
//        return new Diana("diana", 18);
//    }

}
