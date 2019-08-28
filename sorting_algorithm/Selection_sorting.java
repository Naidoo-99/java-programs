package sorting_algorithm;

public class Selection_sorting {
	 
    public static int[] doSelectionSort(int[] arr){
         
    		for (int i = 0; i < arr.length - 1; i++)
        {
    			int index = i;
    				for (int j = i + 1; j < arr.length; j++)
    						if (arr[j] < arr[index]) 
    							index = j;
      
    			int smallerNumber = arr[index];  
    				arr[index] = arr[i];
    				arr[i] = smallerNumber;
        }
        return arr;
    												}
     
    public void selectionsorting(){
         
        	int[] arr1 = {10,34,2,56,7,67,88,42};
        	int[] arr2 = doSelectionSort(arr1);
        		for(int i:arr2){
        				System.out.print(i);
            			System.out.print(", ");
        						}
    							  }
								}