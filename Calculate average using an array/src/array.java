public class array {

    public static void main(String[] args) {
        double[] arr = {20, 15.68, 17.45, 247, 10.25};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }

        double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);
    }
}