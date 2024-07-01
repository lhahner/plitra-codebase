package codebase.pli.plitra.DatatypeClasses;

import java.io.File;

public class FILE {
	File filename;

	public FILE init(String filename) {
	this.filename = new File(filename);
	return this;
	}
}
