package algstudent.s0;

public class PrimeOrNotJava1 {
	
	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if(x%i == 0)
				return false;
		}
		return true;
	}

}
