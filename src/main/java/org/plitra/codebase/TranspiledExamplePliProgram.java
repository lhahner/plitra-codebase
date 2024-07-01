package org.plitra.codebase;

import org.hibernate.validator.constraints.Range;

public class TranspiledExamplePliProgram {
	@Range(max=3)
	public double var_1;
	
	@Range(max=2)
	public double main_proc() {
		return 22222;
	}
}
