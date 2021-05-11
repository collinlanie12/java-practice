import java.util.Arrays;

public class InPlaceReverse {

    /*
     * This method will swap the first element of the array with the last element.
     * The second element with the second last element.. etc Time complexity for
     * In-place reverse in O(n/2). Benefits: Less space on memory because we dont
     * have to create another array.
     */
    static void reverseArray(int intArray[], int size) {
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }

        // Prints out the reversed array below
        System.out.println("Reversed Array: " + Arrays.toString(intArray));
    }

    public static void main(String[] args) {

        int[] intArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        // Prints original array first
        System.out.println("Original Array: " + Arrays.toString(intArray));

        // Call our reverseArray function to reverse the array
        reverseArray(intArray, intArray.length);

    }
}
