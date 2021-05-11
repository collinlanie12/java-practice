public class ForLoopReverse {

    /*
     * This method reverse_array takes in a char array and an int. The new array is
     * made by taking the length of the char array. for loop loops the length of the
     * array and then makes hold_array have the first index of the char array put at
     * the end of the hold_array and so on...
     */
    static void reverse_array(char char_array[], int n) {
        char[] hold_array = new char[n];

        int j = n;

        for (int i = 0; i < n; i++) {
            hold_array[j - 1] = char_array[i];
            j = j - 1;
        }
        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(hold_array[k] + " ");
        }
    }

    public static void main(String[] args) {
        char[] char_array = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("Original array: ");
        for (int k = 0; k < char_array.length; k++) {
            System.out.print(char_array[k] + " ");
        }
        System.out.println();
        reverse_array(char_array, char_array.length);
    }
}
