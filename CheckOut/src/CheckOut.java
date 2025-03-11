import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        do {
            totalCost += SafeInput.getRangedDouble(in, "Enter the price of the item (0.50 - 10.00)", 0.50, 10.00);
        } while (SafeInput.getYNConfirm(in, "Do you have more items to add? (Y/N)"));
        System.out.printf("The total cost of your items is: $%.2f%n", totalCost);
        in.close();
    }
}
