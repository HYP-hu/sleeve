package com.lin.missyou.dto;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class SchoolDTO {
    @Length(min=2, max = 10)
    private String schoolName;
}
