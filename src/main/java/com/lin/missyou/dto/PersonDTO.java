package com.lin.missyou.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
//@Data // @Getter @Setter equals hashCode toString
public class PersonDTO {
    private String name;
    private Integer age;
}
