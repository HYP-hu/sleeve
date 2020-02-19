package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import com.lin.missyou.dto.SchoolDTO;
import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.model.BannerModel;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.service.BannerService;
import com.lin.missyou.service.BannerServiceImpl;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.Map;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public BannerModel getByName(@PathVariable String name){
        return bannerService.getByName(name);
    }






//    @Autowired
//    @Qualifier("irelia")
//    private ISkill dia;

//    @Autowired
//    private ISkill camille;
//
//    @Autowired
//    private ISkill diana;

//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Autowired
//    private ISkill iSkill;

//    @PostMapping("/test/{id}")
//    public PersonDTO test1(@PathVariable(name = "id") @Range(min = 1, max = 10) @Max(value = 10,message = "不能超过是10") Integer id,
//                           @RequestParam @Length(min = 4) String name,
//                           @RequestBody @Validated PersonDTO personDTO){
//        System.out.println(id);
//        System.out.println(name);
////        PersonDTO person1 = new PersonDTO();
////        person1.setAge(18);
////        person1.setName("哈哈");
//
////        PersonDTO dto = PersonDTO.builder()
////                .name("7yue")
////                .age(18)
////                .build();
//        PersonDTO person2 = new PersonDTO();
//        person2.setName("嘿嘿");
//        person2.setAge(22);
//        return personDTO;
//    }
//
//    @GetMapping("/test")
//    public String test2() throws Exception {
//        System.out.println("1111111111111111111");
//        System.out.println(DianaCondition.class);
//        System.out.println(this.username + ": " + this.password);
//        iSkill.r();
//        throw new NotFoundException(10000);
////        throw new Exception("出错了");
////        return "Hello, 九月";
//    }
}
