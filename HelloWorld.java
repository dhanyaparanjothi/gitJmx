// File: gitJmx/HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        int a = 5;
        int b; // This will be initialized from the command-line argument

        // Check if a command-line argument for 'b' is provided
        if (args.length > 0) {
            try {
                b = Integer.parseInt(args[0]); // Parse the first argument as an integer
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid number format for 'b'. Using default value 0.");
                b = 0; // Default value if parsing fails
            }
        } else {
            System.err.println("Warning: 'b' value not provided as command-line argument. Using default value 0.");
            b = 0; // Default value if no argument is provided
        }

        int c = a + b;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Calculation: c = a + b");
        System.out.println("Value of c: " + c);
    }
}
