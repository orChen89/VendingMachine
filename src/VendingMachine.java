import java.util.Scanner;

public class VendingMachine {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Please enter your amount of money to receive a drink: ");

        VG vg = new VG();

        vg.amountOfMoney = SCANNER.nextDouble();

        vg.buyDrink();
    }
}
