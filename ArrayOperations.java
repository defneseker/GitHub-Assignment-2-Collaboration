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
}