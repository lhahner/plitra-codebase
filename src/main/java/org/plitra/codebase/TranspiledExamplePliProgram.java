package org.plitra.codebase;

import java.util.List;

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

	public @Decimal(5) double Z;
	public @Char(5) String MESSAGE;

	@Decimal(5)
	public double PROCBA(double M) {
		if (M < 2) {
			return 1;
		}
		if (M % 2 == 0) {
			if (M == 2) {
				return 0;
			} else {
				return 1;
			}
		}
		if (M % 3 == 0) {
			if (M == 3) {
				return 0;
			} else {
				return 1;
			}
		}
		Z = 5;
		while (Z * Z <= M) {
			if (M % Z == 0) {
				return 1;
			}
			Z = Z + 2;
			if (M % Z == 0) {
				return 1;
			}
			Z = Z + 4;
		}
		return M;
	}
}
