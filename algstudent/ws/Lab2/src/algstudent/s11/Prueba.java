package algstudent.s11;

import java.util.Date;

public class Prueba {

	public static void main(String arg []) {
		tiempo();
	}
	
	
	public static void tiempo() {
		long principio = System.currentTimeMillis(); 
		
		long max = Long.MAX_VALUE;
		Date date = new Date(max);
		
		System.out.println(date); 
	}
}
