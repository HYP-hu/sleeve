package com.lin.missyou.dto;
import com.lin.missyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


//@Data // @Getter @Setter @EqualsAndHashCode equals hashCode toString
//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor
//public class PersonDTO {
//    @NonNull
//    private String name;
//    private Integer age;
//}

//@AllArgsConstructor
//@NoArgsConstructor
//@Setter

//@Builder
//@NoArgsConstructor
//@Setter
//public class PersonDTO {
//    private String name;
//    private Integer age;
//}

@Getter
@Setter
@PasswordEqual
public class PersonDTO {
    @Length(min = 2, max = 10, message = "name最大长度在2和10之间")
    private String name;
    private Integer age;
    @Valid
    private SchoolDTO schoolDTO;

    private String password1;
    private String password2;


}
