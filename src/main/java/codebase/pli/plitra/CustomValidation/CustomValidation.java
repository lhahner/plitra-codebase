package codebase.pli.plitra.CustomValidation;

import java.lang.reflect.Field;

import org.plitra.codebase.TranspiledExamplePliProgram;

import jakarta.validation.constraints.Size;

public class CustomValidation {
	public void validate() throws IllegalArgumentException, IllegalAccessException {
		TranspiledExamplePliProgram p = new TranspiledExamplePliProgram();
		
		for (Field field : p.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(Size.class)) {
				Object objectValue = field.get(p);

				if (objectValue instanceof String doubleValue) {
//	    			  if(field.getAnnotation(Size.class).max() > getDoubleLenth((Double)doubleValue)) {
					System.out.println("xx");
//	        		  }
				}
			}
		}

	}
}
