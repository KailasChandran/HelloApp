public class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if arguments exist
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String argName : args) {
                nameBuilder.append(argName).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}