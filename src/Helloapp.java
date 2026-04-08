public class HelloApp {
    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if argument is provided
        if (args.length > 0) {
            name = args[0];
        }

        // Display output
        System.out.println("Hello, " + name + "!");
    }
}