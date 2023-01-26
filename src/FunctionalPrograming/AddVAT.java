package FunctionalPrograming;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] prices= scanner.nextLine().split(", ");
        UnaryOperator<Double> addVat= e->e=e*1.2;
        System.out.println("Prices with VAT:");
        for (String item: prices){
            double digit=Double.parseDouble(item);
            System.out.printf("%.2f%n",addVat.apply(digit));
        }
    }
}
