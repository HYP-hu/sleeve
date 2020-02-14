package com.lin.missyou.api.v1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    @GetMapping("/hello/{id}")
    public String test(@PathVariable("id") String id) {

        String res = String.format("Hello %2s", id);
        System.out.println(res.replace(" ", "1234"));
        return String.format("Hello %2s 九月 ", id);
    }

    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") String id) {
        System.out.println(id + 3);
        // 装箱: 把基本数据类型转成包装类
        // 1、自动装箱

        return "小木木";
    }

    @RequestMapping(value = "/get_info", method = RequestMethod.GET)
    public String getUserInfo(@RequestParam(name = "name") String name, @RequestParam(name = "gender") String gender) {
        return String.format("%2s name %2s gender", name, gender);
    }

}
