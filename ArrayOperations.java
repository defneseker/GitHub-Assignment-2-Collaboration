import java.util.Random;
import java.util.Scanner;
/**
 * This is a menu-driven console application that supports operations such as 
 * generating an array of random elements of wanted size, finding the maximum 
 * and minimum of the generated array, displaying how each element of the array 
 * differs from the average and finding the sum of elements with odd- and even-numbered indexes.
 * @author Esra Yalçın
 */
public class ArrayOperations {
    public static int[] generateArray (int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(101);
        }
        return arr;
    }

    public static int findMaximum(int[] arr){
        int maximum = arr[0]; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    
    public static int findMinimum(int[] arr){
        int minimum = arr[0]; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
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
            }
            else{
                oddSum += array[i];
            }
        }
        System.out.println("The sum of elements with odd indexes is " + oddSum + ".");
        System.out.println("The sum of elements with even indexes is " + evenSum + ".");
    }
    public static void main(String[] args) {
        int arraySize;
        int userChoice;
        int minChoice = 1;
        int maxChoice = 2;
        int diffChoice = 3;
        int sumChoice = 4;
        int exitChoice = 5;
        boolean isRunning = true;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the array size: ");
        arraySize = in.nextInt();
        int[] array = generateArray(arraySize);

        System.out.print("Here is the generated array: ");
        for (int element : array){
            System.out.print(element + " ");
        }
        
        while(isRunning) {
            System.out.println("\nPlease choose from the menu: ");
            System.out.println("1. Find the array's minimum ");
            System.out.println("2. Find the array's maximum ");
            System.out.println("3. Display how each element of the array differs from the average ");
            System.out.println("4. Find the sum of elements with odd and even numbered indexes ");
            System.out.println("5. Exit");

            userChoice = in.nextInt();

            if (userChoice == minChoice){
                System.out.println("The array's minimum is " + findMinimum(array));
            }
            if (userChoice == maxChoice){
                System.out.println("The array's maximum is " + findMaximum(array));
            }
            if (userChoice == diffChoice){
                arraysDifference(array);
            }
            if (userChoice == sumChoice){
                Sum(array);
            }
            if (userChoice == exitChoice){
                isRunning = false;
            }
        }
        in.close(); 
    }  
}