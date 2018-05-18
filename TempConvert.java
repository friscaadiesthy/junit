import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TempConvert
{
	private static Scanner input;

	public static void main (String[] args)
	{
		char loop;
		int pilihan;
		double f, c, r;
		input = new Scanner(System.in);
		converter ubah = new converter();
		
		do
		{
			System.out.println ("Silahkan pilih tipe converter yang ingin digunakan\n");
			System.out.println ("========MENU========");
			System.out.println ("1. Farenheit ke Celcius");
			System.out.println ("2. Farenheit ke Reamur");
			System.out.println ("3. Celcius ke Farenheit");
			System.out.println ("4. Celcius ke Reamur");
			System.out.println ("5. Reamur ke Farenheit");
			System.out.println ("6. Reamur ke Celcius");
			System.out.println ("====================");
			
			System.out.print ("Masukkan pilihan anda : ");
			pilihan = input.nextInt();
			
			switch (pilihan)
			{
				case 1:
				System.out.print("Masukkan nilai derajat Fahrenheit : ");
				f = input.nextDouble();
				ubah.f_to_c(f);
				break;
				
				case 2:
				System.out.print("Masukkan nilai derajat Fahrenheit : ");
				f = input.nextDouble();
				ubah.f_to_r(f);
				break;
				
				case 3:
				System.out.print("Masukkan nilai derajat Celcius : ");
				c = input.nextDouble();
				ubah.c_to_f(c);
				break;
				
				case 4:
				System.out.print("Masukkan nilai derajat Celcius : ");
				c = input.nextDouble();
				ubah.c_to_r(c);
				break;
				
				case 5:
				System.out.print("Masukkan nilai derajat Reamur : ");
				r = input.nextDouble();
				ubah.r_to_f(r);
				break;
				
				case 6:
				System.out.print("Masukkan nilai derajat Reamur : ");
				r = input.nextDouble();
				ubah.r_to_c(r);
				break;
			}
			System.out.print("Apakah anda masih ingin mengulangi program? (Y/N)");
			loop = input.next().charAt(0);
		}while (loop == 'y' || loop == 'Y');
	}
		
	@Test
	   public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	   }
}
