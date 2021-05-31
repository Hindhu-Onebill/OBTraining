package com.onebill.corejava.Day10Handson;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationDemo {
	@Retention(RetentionPolicy.RUNTIME)
   public @interface Cars{
	   Manufacture[] value() default { }; 
   }
   @Manufacture("Toyoto")
   @Manufacture("Benz")
   @Manufacture("BMW")
   @Manufacture("Tata")
   public @interface Car{
	   String value();
   }
   @Repeatable(value = Cars.class )
   public @interface Manufacture{
	   String value();
   }
	
	public static void main(String[] args) {
	  Manufacture [] a =  Car.class.getAnnotationsByType(Manufacture.class);
	  System.out.println("Manufacture of cars..."+ a.length);
	  Cars cars = Car.class.getAnnotation(Cars.class);
	  for(Manufacture m : cars.value()) {
		  System.out.println(m.value());
	  }
	  
	}

}