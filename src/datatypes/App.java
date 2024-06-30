package datatype;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.validation.constraints.Size;

/**
 * Hello world!
 *
 */
public class App {
	
	
    public static void main( String[] args ) throws Exception
    {
      Program p = new Program("xx");
      p.tester();
      
      for(Field field : p.getClass().getDeclaredFields()) {
    	  if(field.isAnnotationPresent(Size.class)) {
    		  Object objectValue = field.get(p);
    		  
    		  if(objectValue instanceof String doubleValue) {
//    			  if(field.getAnnotation(Size.class).max() > getDoubleLenth((Double)doubleValue)) {
        			  System.out.println("xx");
//        		  }
    		  }
    	  }
      }
    }
    
    private static int getDoubleLenth(Double val) {
    	String x = Double.toString(val);
    	return x.length();
    }
}
