package com.lin.missyou.dto.validators;

import com.lin.missyou.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    // 第二个: 自定义注解修饰的目标的类型 如何修饰name字段目标类型为String
    private int min;
    private int max;

    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        if (password1.length() < this.min || password2.length() > this.max){
            return false;
        }
        boolean match = password1.equals(password2);

        return match;
    }
}
