package com.gmail.lizaiatsenko;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by liza on 16/03/2017.
 */
public class HobbyValidator implements ConstraintValidator<IsValid, String> {
    public void initialize(IsValid isValid) {

    }

    public boolean isValid(String hobby, ConstraintValidatorContext constraintValidatorContext) {
        if(hobby== null){
            return false;
        }
        if(hobby.matches("Java")){
            return true;
        }else {
            return false;
        }

    }
}
