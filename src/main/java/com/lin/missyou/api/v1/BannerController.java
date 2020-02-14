package com.lin.missyou.api.v1;

import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.condition.DianaCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/banner")
public class BannerController {

//    @Autowired
//    @Qualifier("irelia")
//    private ISkill dia;

//    @Autowired
//    private ISkill camille;
//
//    @Autowired
//    private ISkill diana;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Autowired
    private ISkill iSkill;

    @PostMapping("/test/{id}")
    public Map<String, Object> test1(@PathVariable(name = "id") Integer id,
                        @RequestParam String name,
                        @RequestBody Map<String, Object> person){
        System.out.println(id);
        System.out.println(name);

        return person;
    }

    @GetMapping("/test")
    public String test2() throws Exception {
        System.out.println("1111111111111111111");
        System.out.println(DianaCondition.class);
        System.out.println(this.username + ": " + this.password);
        iSkill.r();
        throw new NotFoundException(10000);
//        throw new Exception("出错了");
//        return "Hello, 九月";
    }
}
