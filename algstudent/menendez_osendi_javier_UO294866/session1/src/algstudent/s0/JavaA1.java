package algstudent.s0;

import java.util.List;


public class JavaA1 {
	
	@SuppressWarnings("unused")
	private static List<Integer> primes; 
	public static void main(String [] args) {
		
		int n = 10000;
		for (int i = 0; i < 7; i++) {
			double t1= System.currentTimeMillis ();
			primes = PrimesListJava1.listPrimes(n);
			double t2 = System.currentTimeMillis ();
			System.out.print("n = " + n + "*** time = " + (t2-t1) + " milliseconds \n");
			n = n*2;
		}
	}


}
