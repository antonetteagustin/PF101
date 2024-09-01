import java.util.Scanner;

public class activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double FRUITS_PRICE = 50.00;
        final double VEGETABLES_PRICE = 30.00;
        final double DAIRY_PRICE = 70.00;

        double totalCost = 0;
        int nItems = 0;

        System.out.print("Enter the number of different item types you want to buy: ");
        int numItemTypes = scanner.nextInt();

        for (int i = 0; i < numItemTypes; i++) {
            System.out.println("\nSelect item type for item " + (i + 1) + ": ");
            System.out.println("1. Fruits (PHP 50 each)");
            System.out.println("2. Vegetables (PHP 30 each)");
            System.out.println("3. Dairy (PHP 70 each)");
            int itemType = scanner.nextInt();

            System.out.print("Enter the number of kilos or item of this type: ");
            int numItems = scanner.nextInt();

            double pricePerItem = 0;

            if (itemType == 1) {
                nItems = numItems;
                pricePerItem = FRUITS_PRICE;
                System.out.println("You selected Fruits. Price: PHP 50 each.");
            } else if (itemType == 2) {
                nItems = numItems;
                pricePerItem = VEGETABLES_PRICE;
                System.out.println("You selected Vegetables. Price: PHP 30 each.");
            } else if (itemType == 3) {
                nItems = numItems;
                pricePerItem = DAIRY_PRICE;
                System.out.println("You selected Dairy Products. Price: PHP 70 each.");
            } else {
                System.out.println("Invalid item type selected.");
                continue;  
            }

            double itemCost = pricePerItem * numItems;
            totalCost += itemCost;
    
        }

        if (nItems > 5) {
            totalCost *= 0.90; 
            System.out.println("You have exceeded 5 items per category. A 10% discount has been applied.");
        }

        double VAT = totalCost * 0.12;
        totalCost += VAT;
        System.out.println("A 12% VAT has been applied.");


        if (totalCost >= 2000){
            totalCost = totalCost * 0.95;
            System.out.println("You have exceeded 2000 PHP. A 5% discount has been applied.");
        }

        System.out.println("Your total cost for all items is: PHP " + totalCost);

        scanner.close();
    }
}
