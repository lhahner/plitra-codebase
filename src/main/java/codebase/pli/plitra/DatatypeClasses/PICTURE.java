package codebase.pli.plitra.DatatypeClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PICTURE {

		Pattern pattern;
		String content;

		public PICTURE(String regex) {
			pattern = Pattern.compile(regex);
		}
		public void init(String content) {

			Matcher matcher = pattern.matcher(content);
     		if (matcher.matches()) {
     			this.content = content;
     		}
		}
	}
