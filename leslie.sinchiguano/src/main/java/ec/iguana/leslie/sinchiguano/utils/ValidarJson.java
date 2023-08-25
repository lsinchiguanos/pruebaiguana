package ec.iguana.leslie.sinchiguano.utils;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class ValidarJson {

    public static <T> List<String> validate(T input) {
        List<String> errors = new ArrayList<>();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(input);
        if (violations.size() > 0) {
            for (ConstraintViolation<T> violation : violations) {
                errors.add(violation.getPropertyPath() + " " + violation.getMessage());
            }
        }
        return errors;
    }

}
