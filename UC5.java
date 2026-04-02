/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop
 * The application accepts multiple names as command-line arguments and displays 
 * a personalized greeting. If no names are provided, it defaults to "Hello, World!".
 * * @author Reeju Banerjee
 * @version 5.0
 * @since UC1
 */
public class UC5 {

    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Use Enhanced For Loop (for-each) to traverse all arguments
            for (String name : args) {
                // Add a comma and space before every name except the first one
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print the final greeting message
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}