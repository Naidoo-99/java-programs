package sorting_algorithm;


public class insertion_sorting {

public void insertionsorting() {
	

		int[]array1 = {88,45,78,2,47,26,12};
		int[]array2 = doinsertion_sort (array1);
				for(int i:array2) {
						System.out.print(i);
						System.out.print(", ");
						}	
								}






public static int[] doinsertion_sort(int[] input){

		int temp;
				for (int i = 1; i < input.length; i++) {
						for(int j =i ; j> 0 ; j--) {
								if (input[j] <input[j-1]){
										temp = input[j];
											input[j] = input[j-1];
											input[j-1] = temp;
			
														 }	
													}
														}
return input;
									}
							}

