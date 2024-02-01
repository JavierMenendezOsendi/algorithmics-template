package alg7777777;

import java.util.ArrayList;

public class JavaA1 {
	
	

	public static void main(String[] args) {
		
		long n = 10000; 
		for (int i = 0; i<7; i++) {
			long t1 = System.currentTimeMillis(); 
			ArrayList<Integer> listaPrimos = listadoPrimos(n);
			long t2 = System.currentTimeMillis();
			System.out.print("n = " + n + " "+ "time = " + (t2-t1) + "milliseconds = " + (t2-t1)/1000 + " seconds. ");
			System.out.println();
			n = n*2; 
		}
	}
	
	
	static boolean isPrimo(int n) {
			
			boolean p = true; 
			for (int i = 2; i<n; i++) {
				if (n%i == 0) 
					p = false; 
			}
			return p; 
		}
	
	
	static ArrayList<Integer> listadoPrimos( long n) {
			
			ArrayList<Integer> primos = new ArrayList<>(); 
			
			for (int i = 2; i<n+1; i++ ) {
				if (isPrimo(i)) {
					primos.add(i); 
				}
			}
			return primos; 
		}
	
	

}
