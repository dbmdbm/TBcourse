import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        double currencyEuroRate = 4.455;
        String errorMessage = "Invalid value. Reason:";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of Euro:");

        double amountOfEuro = scanner.nextDouble();

        if (amountOfEuro < 0) {
            System.out.println(errorMessage + " Negative value");
//        } else if (amountOfEuro = 0) {
//            System.out.println(errorMessage + " The amount is zero");
        } else {
            double resultEuroToPln = amountOfEuro * currencyEuroRate;
            System.out.println("The amount is: " + resultEuroToPln + " zł.");
        }
    }
}
