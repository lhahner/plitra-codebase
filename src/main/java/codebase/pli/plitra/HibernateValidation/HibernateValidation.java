package codebase.pli.plitra.HibernateValidation;

import java.util.Set;

import org.plitra.codebase.TranspiledExamplePliProgram;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class HibernateValidation {

	public static void main(String[] args) {
		TranspiledExamplePliProgram tepp = new TranspiledExamplePliProgram();
	
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TranspiledExamplePliProgram>> violations = validator.validate(tepp);
		
		for(ConstraintViolation<TranspiledExamplePliProgram> violation : violations) {
			System.out.println(violation.getMessage());
		}
	}

}
