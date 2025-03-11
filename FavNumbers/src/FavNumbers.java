import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for input

        // Prompt for the user's favorite integer using getInt
        int favoriteInt = SafeInput.getInt(in, "Please enter your favorite integer");

        // Prompt for the user's favorite double using getDouble
        double favoriteDouble = SafeInput.getDouble(in, "Please enter your favorite double");

        // Output the results
        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);

        // Close the Scanner
        in.close();
    }
}
