package algstudent.s11;

public class Vector7 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] v1 = new int[n];
		int[] v2 = new int[n];

		Vector1.fillIn(v1);
		Vector1.fillIn(v2);

		long startTime = System.currentTimeMillis();
		@SuppressWarnings("unused")
		int matches = Vector1.matches2(v1, v2);
		long endTime = System.currentTimeMillis();
		long elapsedTime = (endTime - startTime);

		System.out.println("Time: " + elapsedTime + " millieseconds");
	}
}
