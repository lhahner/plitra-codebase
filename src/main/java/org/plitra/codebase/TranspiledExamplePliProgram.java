package org.plitra.codebase;

import java.util.List;


import codebase.pli.plitra.CustomValidation.Decimal;
import codebase.pli.plitra.CustomValidation.init;
import codebase.pli.plitra.DatatypeClasses.DECIMAL;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TranspiledExamplePliProgram {
	
//Wiedererkennungswert der Syntax
//OOP als semantische Paradigma 
	
	@Decimal(10)
	double var_1;
	
	@NotNull
	@Size(min = 1)
	public List<@NotNull String> proc_1() {
		return null;
	}
}
