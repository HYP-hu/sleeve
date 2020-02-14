package com.lin.missyou.api.v1;


import com.lin.missyou.api.dao.LuckymoneyRepository;
import com.lin.missyou.api.dataobject.Luckymoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LuckymoneyController {

    @Autowired
    private LuckymoneyRepository repository;


    /*
    * 查询红包
    * */

    @GetMapping("/luckymoney")
    public List<Luckymoney> list() {
        return  repository.findAll();
    }
    /*
    * 创建红包
    * */
    @PostMapping("luckymoney")
    public Luckymoney create(@RequestBody Luckymoney luckymoney){
        return repository.save(luckymoney);
    }
    /*
    * 更新红包
    * */
    @PutMapping("luckymoney/{id}")
    public Luckymoney update(@PathVariable("id") Integer id,
                             @RequestParam(value = "consumer", required = true, defaultValue = "hu") String consumer){
        Optional<Luckymoney> optional = repository.findById(id);
        System.out.println(optional);
        if (optional.isPresent()){
            Luckymoney luckymoney = optional.get();
            luckymoney.setConsumer(consumer);
            return luckymoney;
        } else {
            return null;
        }
    }
    /*
    * 删除红包
    * */
    @DeleteMapping("luckymoney/{id}")
    public Luckymoney delete(@PathVariable("id") Integer id){
        Optional<Luckymoney> optional = repository.findById(id);
        if (optional.isPresent()){
           Luckymoney luckymoney =  optional.get();
           repository.delete(luckymoney);
           repository.flush();
           return luckymoney;
        } else {
            return null;
        }
    }
}
