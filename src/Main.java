import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //creating an array
        //Step 1: Declare, creates a reference to array
        //Step 2: Instantiation of an array, creates an array
        //Step 3: assigns values to cells in array

        //Step 1
        int[] intArray;

        //Step 2
        intArray = new int[3];

        //Step 3
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        //Combined steps
        String[] sArray = {"a", "b", "c"};
        System.out.println(Arrays.toString(sArray));
        }
}