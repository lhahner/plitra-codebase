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

public class TranspiledExamplePliProgram implements IProgram {

//Wiedererkennungswert der Syntax && 
//OOP als semantische Paradigma -> Ziel

	public @Decimal(4) double var_1 = 2;
	public @Decimal(4) double var_2 = 3;
	
	public void branchproc (){
		while (var_1 < var_2) {
			do {
				System.out.println("smaller");
			} while(!(var_1 == var_2));
		}	
	}
}

