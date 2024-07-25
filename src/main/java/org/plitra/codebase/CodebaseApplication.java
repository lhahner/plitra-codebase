package org.plitra.codebase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
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
import java.net.URL;
import java.net.URLClassLoader;

public class CodebaseApplication {

	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		BigDecimal pr = new BigDecimal("10000000002065383");
	
		System.out.println(new TranspiledExamplePliProgram().PROCBA(pr) + "\n");
		long endTime   = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		System.out.println(
				"CPU: " + Runtime.getRuntime().availableProcessors()+ 
				
				"RAM: " + Runtime.getRuntime().totalMemory() +
				"Duration: " +  totalTime);
				
//		Validator  validator = factory.getValidator();
//		
//		Set<ConstraintViolation<TranspiledExamplePliProgram>> violations = validator.validate(tepp);
//		
//		for(ConstraintViolation<TranspiledExamplePliProgram> violation : violations) {
//			System.out.println(violation.getMessage());
		}
	}


