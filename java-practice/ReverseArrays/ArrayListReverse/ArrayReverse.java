import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

    /* function reverses the elements of an array */
    static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array: " + Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        Integer[] myArray = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.asList(myArray));
        reverse(myArray);
    }
}
