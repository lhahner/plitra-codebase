//@see https://www.baeldung.com/java-validation

ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    	Validator validator = factory.getValidator();
    	
    	Program p = new Program();
    	Set<ConstraintViolation<Program>> violations = validator.validate(p);
    	
    	for (ConstraintViolation<Program> violation : violations) {
    	    System.out.println(violation.getMessage()); 
    	}
