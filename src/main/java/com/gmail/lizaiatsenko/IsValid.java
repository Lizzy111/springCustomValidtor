package com.gmail.lizaiatsenko;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValid {
    String message() default "Please insert java music or football";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]payload()default {};
}
