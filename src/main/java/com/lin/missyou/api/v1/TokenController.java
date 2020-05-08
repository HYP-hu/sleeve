package com.lin.missyou.api.v1;

import com.lin.missyou.dto.TokenGetDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping(value = "token")
@RestController
public class TokenController {
    @PostMapping("")
    public Map<String, String> getToken(@RequestBody @Validated TokenGetDTO userData){
        return null;
    }
}
