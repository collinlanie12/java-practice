public class PuppyPractice {

    public PuppyPractice(String name) {
        // This constructor only has one parameter, name.
        System.out.println("Passed Name is: " + name);
    }

    public static void main(String[] args) {
        // Following statement will create an object myPuppy
        PuppyPractice myPuppy = new PuppyPractice("Tommy");
    }
}
