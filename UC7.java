/**
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() 
 * Method or Default Message.
 * * @author Reeju Banerjee
 * @version 7.0
 * @since UC1
 */
public class UC7 {

    public static void main(String[] args) {
        String names;

        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            // Default greeting
            names = "World";
        } else {
            // Step 2: Use String.join to concatenate the args array
            // The method takes (delimiter, elements)
            names = String.join(", ", args);
        }

        // Step 3: Print the final greeting
        System.out.println("Hello, " + names + "!");
        
    } 
} 