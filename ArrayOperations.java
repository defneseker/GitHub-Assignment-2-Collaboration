import java.util.Random;

public class ArrayOperations {
    public static int [] generateArray (int size) {
        Random rand = new Random();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(101);
        }
        return arr;
    }

    public static int findMaximum(int [] arr){
        int Maximum = arr[0]; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]>Maximum){
                Maximum=arr[i];
            }
        }
        return Maximum;
    }
    
    public static int findMinimum(int [] arr){
        int Minimum = arr[0]; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]<Minimum){
                Minimum=arr[i];
            }
        }
        return Minimum;
    }

    public static void arraysDifference(int[] array) {
        int sum = 0;
        int count = 0;
        double average;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
            count ++;
        }
        average = sum / count;
        double[] newArray = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i] - average;
            System.out.print(newArray[i] + ", ");
        }
    }
    public static void Sum(int[] array){
    
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < array.length; i++){
            if(i % 2 ==0){
                evenSum += array[i]; 
            }else{
                oddSum += array[i];
            }
        }
        System.out.println("The sum of elements with odd indexes is " + oddSum + ".");
        System.out.println("The sum of elements with even indexes is " + evenSum + ".");
    } 
}
   



