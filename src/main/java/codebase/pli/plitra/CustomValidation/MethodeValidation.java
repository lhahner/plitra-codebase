package codebase.pli.plitra.CustomValidation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

import org.plitra.codebase.TranspiledExamplePliProgram;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.executable.ExecutableValidator;

public class MethodeValidation {
	IProgram program;

	public MethodeValidation(IProgram program) {
		this.program = program;
	}

	public void validateDecimalMethode() throws NumberFormatException{

		try {

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			ExecutableValidator executableValidator = factory.getValidator().forExecutables();
			Method[] methode = this.program.getClass().getMethods();
			Set<ConstraintViolation<IProgram>> violations;

			Object value = methode[0].invoke(this.program, null);
			violations = executableValidator.validateReturnValue(this.program, methode[0], (double) value);

			if (violations.size() == 1) {
				Class<? extends Annotation> constraintType = violations.iterator().next().getConstraintDescriptor()
						.getAnnotation().annotationType();
				if (Decimal.class == constraintType) {
					throw new NumberFormatException("Validation Constraint violated, program not valid to use.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
