package com.meetcity.payment.channel.endpoint.validate;

import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class VoValidator {

    private static Validator validator = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory()
            .getValidator();

    public static<T> Set<ConstraintViolation<T>> validate(T o) {
        return validator.validate(o);
    }

}
