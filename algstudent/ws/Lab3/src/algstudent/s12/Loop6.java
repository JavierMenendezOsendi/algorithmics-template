package algstudent.s12;

public class Loop6 {

	//n cubo
		public static long loop6(int n) {
			long cont = 0;
			for (long i = 1; i <= n; i++)
				for (long j = 1; j <= i; j++)
					for (long k = 1; k <= j; k++)
						for (long l = 1; l <= k ; l *= 2)
							cont++;
			return cont;

		}

		public static void main(String arg[]) {
			long c = 0;
			long t1, t2;

			int nTimes = Integer.parseInt(arg[0]);

			System.out.println("n\ttime\trepetions\tcounter");

			for (int n = 100; n <= 819200; n *= 2) {
				t1 = System.currentTimeMillis();

				for (int repetitions = 1; repetitions <= nTimes; repetitions++)
					c = loop6(n);

				t2 = System.currentTimeMillis();

				System.out.println(n + "\t" + (t2 - t1) + "\t" + nTimes + "\t\t" + c);
			} // for
		} // main

}
