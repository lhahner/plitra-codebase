package plitra.codebase;

/**
* Sample Program, should 
* later be the transpiled PL/I Program
**/

import javax.validation.constraints.Size;

public class Program {
	
	@Size(max=2)
	public String yx;
	
	public Program(String x) {
		this.yx = x;
	}
	
	public void tester() {
		
	}
	
	
}
