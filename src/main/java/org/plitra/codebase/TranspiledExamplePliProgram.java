package org.plitra.codebase;

import java.math.BigDecimal;
import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;

import codebase.pli.plitra.CustomValidation.Char;
import codebase.pli.plitra.CustomValidation.Decimal;
import codebase.pli.plitra.CustomValidation.IProgram;
import codebase.pli.plitra.CustomValidation.init;
import codebase.pli.plitra.DatatypeClasses.DECIMAL;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TranspiledExamplePliProgram implements IProgram {

	public BigDecimal Z;
	public String MESSAGE;

	public double PROCBA(BigDecimal M) {
		if (M.compareTo(BigDecimal.valueOf(2)) < 0) {
			return 1;
		}
		//M % 2 == 0
		if (M.remainder(BigDecimal.valueOf(2)) == BigDecimal.valueOf(0)) {
			if (M == BigDecimal.valueOf(2)) {
				return 0;
			} else {
				return 1;
			}
		}
		if (M.remainder(BigDecimal.valueOf(3)) == BigDecimal.valueOf(0)) {
			if (M == BigDecimal.valueOf(3)) {
				return 0;
			} else {
				return 1;
			}
		}
		Z = Z.valueOf(5);
		while (Z.multiply(Z).compareTo(M) <= 0 ) {
			System.out.println(Z.toString());
			if (M.remainder(Z) == BigDecimal.valueOf(0)) {
				return 1;
			}
			Z = Z.add(BigDecimal.valueOf(2));
			if (M.remainder(Z) == BigDecimal.valueOf(0)) {
				return 1;
			}
			Z = Z.add(BigDecimal.valueOf(4));
			
		}
		return M.doubleValue();
	}
}
