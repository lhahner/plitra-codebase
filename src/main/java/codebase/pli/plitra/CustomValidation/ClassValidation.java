package codebase.pli.plitra.CustomValidation;

import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class ClassValidation {

	IProgram program;

	public ClassValidation(IProgram program) {
		this.program = program;
	}

	public void validateProgramClass() throws NumberFormatException{
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator  validator = factory.getValidator();
		Set<ConstraintViolation<IProgram>> violations = validator.validate(this.program);
		
		for(ConstraintViolation<IProgram> violation : violations) {
			throw new NumberFormatException("Validation Constraint violated, program not valid to use.");

		}

	}
}
