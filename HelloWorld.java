public class HelloWorld {

    // The main method - entry point for the Java program
    public static void main(String[] args) {
        // Print a simple message to the console
        System.out.println("Hello, World!");

        // Example of a basic variable declaration and usage
        int number = 5;
        System.out.println("The number is: " + number);

        // Example of calling a method
        greetUser("lisa-ibrahim");
    }

    // A simple method that prints a greeting for a given user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
}
