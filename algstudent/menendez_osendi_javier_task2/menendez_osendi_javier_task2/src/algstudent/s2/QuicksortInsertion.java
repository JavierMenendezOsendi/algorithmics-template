package algstudent.s2;

public class QuicksortInsertion {
	
	private static int insertionThreshold = 200; 
	
	static int[] v;
	
	public static void quickSortInsertion(int[] a, int left, int right) {
		if (right - left + 1 <= insertionThreshold) {
            insertionSort(a, left, right);
        } else {
        	int i = left;
    		int j = right - 1;
    		int pivot;
    		
    		if (left < right){ 
    			int center = median_of_three(a, left, right);
    			if ((right - left) >= 3){ 
    				pivot = a[center];
    				Vector.interchange(a, center, right);
    				do {         
    			    	while (a[i] <= pivot && i < right) i++; 
    			    	while (a[j] >= pivot && j > left) j--; 
    			        if (i < j) Vector.interchange(a, i, j);
    			    } while (i < j);
    				Vector.interchange(a, i, right);
    				quickSortInsertion(a, left, i-1);
    				quickSortInsertion(a, i+1, right);		
    			} 
    		} 
        }
	}
	
	public static void quicksort(int[] a) {
		quickSortInsertion(a, 0, a.length-1);
	}
	
	public static int median_of_three(int[] a, int left, int right) { 
		int center = (left + right) / 2;
		if (a[left] > a[center])
			Vector.interchange(a, left, center);
		if (a[left] > a[right])
			Vector.interchange(a, left, right);
		if (a[center] > a[right])
			Vector.interchange(a, center, right);
		return center;
	}

    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

	public static void main(String arg[]) {
		int n = 16000000;
		v = new int[n];

		Vector.randomSorted(v);
		System.out.println("VECTOR TO BE SORTED");
		Vector.print(v);
		quicksort(v);
		System.out.println("SORTED VECTOR");
		Vector.print(v);
	} 

}
