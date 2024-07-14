package org.plitra.codebase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import codebase.pli.plitra.CustomValidation.ClassValidation;
import codebase.pli.plitra.CustomValidation.Decimal;
import codebase.pli.plitra.CustomValidation.MethodeValidation;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.executable.ExecutableValidator;

public class CodebaseApplication {

	public static void main(String[] args) throws Exception {
		
		ClassValidation cv = new ClassValidation(new TranspiledExamplePliProgram());
		cv.validateProgramClass();
		
		MethodeValidation mv = new MethodeValidation(new TranspiledExamplePliProgram());
		mv.validateDecimalMethode();
		mv.validateCharMethode();
		
//		Validator  validator = factory.getValidator();
//		
//		Set<ConstraintViolation<TranspiledExamplePliProgram>> violations = validator.validate(tepp);
//		
//		for(ConstraintViolation<TranspiledExamplePliProgram> violation : violations) {
//			System.out.println(violation.getMessage());
		}
	}


