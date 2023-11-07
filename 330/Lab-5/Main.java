public class Main {
    public static void main(String[] args) {
        // different addresses
        Address addressOne = new Address("1 Brighton Beach Avenue", "Brooklyn", "NY", "11235");
        Address addressTwo = new Address("404 Error Avenue", "Computer City", "WEB", "00001");

        Student studentOne = new Student("Cherry Glee", 123, 4.20, addressOne);
        Student studentTwo = new Student("Bliss Sunny", 007, 3.141, addressOne);
        Student studentThree = new Student("Joy Felicity", 1337, 0.01, addressTwo);

        // Test for equality
        System.out.println("Evaluating the equals method");
        System.out.println("StudentOne is equivalent to studentTwo: " + studentOne.equals(studentTwo));
        System.out.println("StudentOne is identical to studentThree: " + studentOne.equals(studentThree));

        // Test the toString method to print the string representation of Student objects
        System.out.println("\nTesting toString method:");
        System.out.println("studentOne: " + studentOne.toString());
        System.out.println("studentTwo: " + studentTwo.toString());
        System.out.println("studentThree: " + studentThree.toString());

        // Test the copy method
        System.out.println("\nEvaluating the copy method");
        Student studentOneCopy = studentOne.copy();
        System.out.println("StudentOne is equal to studentOneCopy: " + studentOne.equals(studentOneCopy));

        // Test the copy constructor
        System.out.println("\nEvaluating copy constructor:");
        Student studentTwoCopy = new Student(studentTwo);
        System.out.println("StudentTwo is equals to studentTwoCopy: " + studentTwo.equals(studentTwoCopy));
    }

}