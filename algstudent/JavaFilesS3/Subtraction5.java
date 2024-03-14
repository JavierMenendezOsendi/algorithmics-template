package algstudent.s3;

public class Subtraction5 {
	
	static long cont;
	
	public static long rec5(int n) {
		
		if(n<= 0)
			cont++;
		else {
			cont++;
			rec5(n-2);
			rec5(n-2);
			rec5(n-2);
		}
		
		return cont; 
			
	}
	
	public static void main(String arg[]) {
		long t1, t2 = 0;
		
		for (int n = 30; n <= 1000000; n += 2) {
			
			t1 = System.currentTimeMillis();
			rec5(n);
			t2 = System.currentTimeMillis();

			System.out.println("n=" + n + "**TIME=" + (t2 - t1) + "**cont=" + cont);
		} // for
	} 

}