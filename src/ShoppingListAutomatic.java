import java.util.Scanner;

public class ShoppingListAutomatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which product would you like to keep buying?\n Wurst, Brot, DVD, Kease, or Butter?\nPlease type your answer:");
        String itemToBuy = scanner.next();
        //Insert available money here:
        double moneyToSpend = 20.00;
        ShoppingCart shoppingCart;
        switch (itemToBuy) {
            case "Wurst" ->
                    shoppingCart = new ShoppingCart((int) Math.floor(moneyToSpend / ShoppingCart.COST_WURST), 0, 0, 0, 0, moneyToSpend);
            case "Brot" ->
                    shoppingCart = new ShoppingCart(0, (int) Math.floor(moneyToSpend / ShoppingCart.COST_BROT), 0, 0, 0, moneyToSpend);
            case "DVD" ->
                    shoppingCart = new ShoppingCart(0, 0, (int) Math.floor(moneyToSpend / ShoppingCart.COST_DVD), 0, 0, moneyToSpend);
            case "Kaese" ->
                    shoppingCart = new ShoppingCart(0, 0, 0, (int) Math.floor(moneyToSpend / ShoppingCart.COST_KAESE), 0, moneyToSpend);
            case "Butter" ->
                    shoppingCart = new ShoppingCart(0, 0, 0, 0, (int) Math.floor(moneyToSpend / ShoppingCart.COST_BUTTER), moneyToSpend);
            case null -> throw new IllegalArgumentException("No answer was given to the question..");
            case default ->
                    throw new IllegalArgumentException("Invalid answer was given to the question.. " + itemToBuy);
        }
        System.out.println(shoppingCart.printReceipt());
        System.out.println("Successful build and run");
    }
}
