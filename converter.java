import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class converter
{
		public static void main (String[] args) {
		      Result result = JUnitCore.runClasses(TestJUnit.class);
		      for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
		      System.out.println("Result=="+result.wasSuccessful());
		   }
	
	public double f_to_c(double f)
	{   
	   double c = ((f-32) * 5)/9;
	   System.out.println("Suhu dalam Fahrenheit : " + f + "\nHasil konversi ke Celcius : " + c);
	   return c;
	}
	
	public double f_to_r(double f)
	{  
		double r = ((f - 32) * 4)/ 9;
		System.out.println("Suhu dalam Fahrenheit : " + f + "\nHasil konversi ke Reamur : " + r);
		return r;
	}
	
	public double c_to_f(double c)
	{  
		double f = ((c * 9)/5) + 32;
		System.out.println("Suhu dalam Celcius : " + c + "\nHasil konversi ke Farenheit : " + f);
		return f;
	}
	
	public double c_to_r(double c)
	{
		double r = ((c * 4)/5);
		System.out.println("Suhu dalam Celcius : " + c + "\nHasil konversi ke Reamur : " + r);
		return r;
	}
	
	public double r_to_c(double r)
	{
		double c = ((r * 5)/4);
		System.out.println("Suhu dalam Reamur : " + r + "\nHasil konversi ke Celcius : " + c);
		return c;
	}
	
	public double r_to_f(double r)
	{
		double f = ((r * 9)/4) + 32;
		System.out.println("Suhu dalam Reamur : " + r + "\nHasil konversi ke Farenheit : " + f);
		return f;
	}
}