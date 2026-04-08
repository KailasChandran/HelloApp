public class HelloApp {
    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if arguments are provided
        if (args.length > 0) {

            // Use StringBuilder to combine multiple names
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma only between names
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            // Assign combined names
            name = nameBuilder.toString();
        }

        // Display output
        System.out.println("Hello, " + name + "!");
    }
}