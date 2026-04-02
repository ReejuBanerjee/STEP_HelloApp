/**
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring 
 * to Remove Trailing Delimiter.
 * * The application accepts multiple names as command-line arguments and displays 
 * a personalized greeting. It appends a delimiter after every name and then 
 * removes the final one using the substring() method.
 * * @author Reeju Banerjee
 * @version 6.0
 * @since UC1
 */
public class UC6 {

    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use StringBuilder for efficient construction
            StringBuilder nameBuilder = new StringBuilder();

            // Step 3: Use Enhanced For Loop to append name + delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 4: Use substring to remove the last trailing ", "
            // We check length > 0 to ensure there's something to trim
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                // Remove the last 2 characters (the comma and the space)
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Step 5: Print the formatted greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}