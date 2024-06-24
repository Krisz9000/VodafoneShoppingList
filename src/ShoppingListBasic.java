public class ShoppingListBasic {
    public static void main(String[] args) {
        //Case for successful purchase
        ShoppingCart shoppingCart1 = new ShoppingCart(3, 2, 2, 1, 4, 62.75);
        try {
            System.out.println(shoppingCart1.printReceipt());
        } catch (IllegalArgumentException exception) {
            System.out.println(String.format(exception + "\nMissing amount: %.2f EUR\n", shoppingCart1.SUM_COST - shoppingCart1.AVAILABLE_MONEY));
        }

        //Case for insufficient funds
        ShoppingCart shoppingCart2 = new ShoppingCart(1, 1, 2, 1, 1, 10.00);
        try {
            System.out.println(shoppingCart2.printReceipt());
        } catch (IllegalArgumentException exception) {
            System.out.println(String.format(exception + "\nMissing amount: %.2f EUR\n", shoppingCart2.SUM_COST - shoppingCart2.AVAILABLE_MONEY));
        }
    }

}
