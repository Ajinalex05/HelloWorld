package VendingMachine;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockItems s = new StockItems();
            WelcomeNote w = new WelcomeNote();
            System.out.println(s.getTotalChange());
            w.note();
            s.showItems();
            System.out.println("\nEnter 0 to Exit\n\nplease enter  the product code");
            int code = sc.nextInt();
            if(code==0) java.lang.System.exit(0);
            if (s.checkCode(code)) {
                Products p = s.checkStock(code);
                if (p != null) {
                    System.out.println("Enter the amount: ");
                    int amt = sc.nextInt();
                    int change = amt - p.getPprice();
                    if (change < 0) {
                        System.out.println("    ---> Given amount is  not enough for this product...! <---");
                    } else if (s.getTotalChange().intValue() < change) {
                        System.out.println("      ---> Sorry.. no change.. <---");
                    } else {
                        s.updateStockAfterPurchase(code);
                        s.updateTotalChangeAfterPurchase(change);
                        System.out.println("---> Please collect your " + p.getPname() + " and balance " + change + " Rupees <---");
                    }
                } else {
                    System.out.println("      ---->Out of Stock <----");
                }
            } else {
                System.out.println("    ---> Wrong input... Please try again <---");
            }

    }
}
