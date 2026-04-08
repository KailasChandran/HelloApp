public class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if arguments are provided
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String argName : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(argName);
                first = false;
            }

            // Assign final string
            name = nameBuilder.toString();
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}