public class AddArray {

    public static void main(String[] args) {
        int[] myArray = { 5, 5, 5 };
        sumArray(myArray);
    }

    // public int sumArray - if i wanted to just return the sum integer
    public static void sumArray(int sumArr[]) {
        int sum = 0;

        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
