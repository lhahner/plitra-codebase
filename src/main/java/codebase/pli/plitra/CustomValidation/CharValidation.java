package codebase.pli.plitra.CustomValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CharValidation implements ConstraintValidator<Char, Object>, IProgram {
	
	 private int length;
	 @Override
	 public void initialize(Char constraintAnnotation) {
		 length = constraintAnnotation.value();
	  }
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value != null) {
			return !(value.toString().length() > length);
		}
		return true;
	}

}
