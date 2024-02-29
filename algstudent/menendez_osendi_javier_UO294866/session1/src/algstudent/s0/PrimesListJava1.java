package algstudent.s0;

import java.util.ArrayList;
import java.util.List;

public class PrimesListJava1 {
	
	public static List<Integer> listPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (PrimeOrNotJava1.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

}
