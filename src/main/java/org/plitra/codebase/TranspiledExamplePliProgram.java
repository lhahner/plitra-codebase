package org.plitra.codebase;

import java.util.List;


import codebase.pli.plitra.CustomValidation.Decimal;
import codebase.pli.plitra.CustomValidation.IProgram;
import codebase.pli.plitra.CustomValidation.init;
import codebase.pli.plitra.DatatypeClasses.DECIMAL;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TranspiledExamplePliProgram implements IProgram{
	
//Wiedererkennungswert der Syntax && 
//OOP als semantische Paradigma -> Ziel
	
	@Decimal(2)
	public double var_1 = 22;
	
	@Decimal(1)
	public double roc_1() {
		return 2;
	}
}
