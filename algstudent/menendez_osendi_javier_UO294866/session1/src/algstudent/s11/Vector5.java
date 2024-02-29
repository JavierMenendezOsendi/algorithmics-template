package algstudent.s11;

public class Vector5 {
	
	public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Vector5 <size_of_vector>");
            return;
        }
        
        int n = Integer.parseInt(args[0]);
        int[] v = new int[n];
        Vector1.fillIn(v);
        long startTime = System.currentTimeMillis();
        int[] m = new int[2];
        Vector1.maximum(v, m);      
        long endTime = System.currentTimeMillis();      
        long elapsedTime = (endTime - startTime)*10;       
        System.out.println("Time: " + elapsedTime + " miliseconds");

    }
}
