package algstudent.s0;

import java.util.ArrayList;
import java.util.List;

public class JavaA2 {
	
	
	public static void main(String[] args) {

		int n = 10000;
		for (int i = 0; i < 7; i++) {
			double t1 = System.currentTimeMillis();
			@SuppressWarnings("unused")
			List<Integer> primes = primesList(n);
			double t2 = System.currentTimeMillis();
			System.out.print("n = " + n + "*** time = " + (t2 - t1) + " milliseconds \n");
			n = n * 2;
		}
	}

	public static boolean isPrime(int m) {
		for (int i = 2; i < m; i++) {
			if (m % i == 0)
				return false;
		}
		return true;
	}

	public static List<Integer> primesList(int n) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}


}
