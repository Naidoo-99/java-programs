package sorting_algorithm;

public class bubble_sorting {
	

public static void bubble_srt(int array[]) {
        		int n = array.length;
        		int k;
        				for (int m = n; m >= 0; m--) {
        						for (int i = 0; i < n - 1; i++) {
        								k = i + 1;
        									if (array[i] > array[k]) {
        										swapNumbers(i, k, array);
        														 }
        														}
        										printNumbers(array);
        											 }
    										}
 
    private static void swapNumbers(int i, int j, int[] array) {
 
    		int temp;
    			temp = array[i];
    			array[i] = array[j];
    			array[j] = temp;
    															}
 
    private static void printNumbers(int[] input) {
         
    		for (int i = 0; i < input.length; i++) {
    			System.out.print(input[i] + ", ");
    											   }
    			System.out.println("\n ");
        
    }
 
    public void bubble() {
    		int[] input = { 24,2,45,20,56,75,256 };
    			bubble_srt(input);
 
    					 }
						    }

