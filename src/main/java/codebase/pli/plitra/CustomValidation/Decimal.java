package codebase.pli.plitra.CustomValidation;



import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Max.List;

import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;

import static java.lang.annotation.ElementType.*;

@Target({FIELD, METHOD})
@Retention(RUNTIME)
@Constraint(validatedBy = DecimalValidation.class)
public @interface Decimal {
	String message() default "Size exceeded";
	int value();
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
