package sorting_algorithm;

public class Quick_sorting {
    
    private int array[];
    private int length;
 
    public void sort(int[] inputArray) {
         
        if (inputArray == null || inputArray.length == 0) {
            return;
        }
        this.array = inputArray;
        length = inputArray.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
       
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
       
        while (i <= j) {
         
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
            
                i++;
                j--;
            }
        }
   
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public void quicksorting(){
         
    	Quick_sorting sorter = new Quick_sorting();
        int[] input = {24,2,45,20,56,75,256};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
