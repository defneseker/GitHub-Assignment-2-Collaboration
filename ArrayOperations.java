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
}
   



