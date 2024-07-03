package codebase.pli.plitra.CustomValidation;

import org.plitra.codebase.TranspiledExamplePliProgram;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DecimalValidation implements ConstraintValidator<Decimal, Object> {
	
	 private int length;
	 @Override
	 public void initialize(Decimal constraintAnnotation) {
		 length = constraintAnnotation.value();
	  }
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value != null) {
			return !(value.toString().substring(0, value.toString().indexOf('.')).length() > length);
		}
		return true;
	}

}
