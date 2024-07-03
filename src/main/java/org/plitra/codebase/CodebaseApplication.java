package org.plitra.codebase;

import java.lang.reflect.Method;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.executable.ExecutableValidator;

public class CodebaseApplication {

	public static void main(String[] args) {
		TranspiledExamplePliProgram tepp = new TranspiledExamplePliProgram();
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator  validator = factory.getValidator();
		
		Set<ConstraintViolation<TranspiledExamplePliProgram>> violations = validator.validate(tepp);
		
		for(ConstraintViolation<TranspiledExamplePliProgram> violation : violations) {
			System.out.println(violation.getMessage());
		}
	}

}
