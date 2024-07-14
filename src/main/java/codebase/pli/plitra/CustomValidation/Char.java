package codebase.pli.plitra.CustomValidation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({FIELD, METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = DecimalValidation.class)
public @interface Char {
	String message() default "Size exceeded";
	int value();
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

