public class Puppy {

    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chose is: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        /* Object creation */
        Puppy myPuppy = new Puppy("Tommy");

        /* Call class method to set puppy's age */
        myPuppy.setAge(6);

        /* Call another class method to get puppy's age */
        myPuppy.getAge();

        /* You can access instance vairable as follows as well */
        System.out.println("Variable Value: " + myPuppy.puppyAge);
    }
}
