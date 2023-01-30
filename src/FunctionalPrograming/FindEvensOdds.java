package FunctionalPrograming;

import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int star = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        String command = scanner.nextLine();
        Predicate<Integer> oddNum = e -> e % 2 != 0;
        Predicate<Integer> evenNum = e -> e % 2 == 0;
        for (int i = star; i <=end ; i++) {
            switch (command){
                case "even":
                    if (evenNum.test(i)){
                        System.out.print(i+" ");
                    }
                    break;
                case "odd":
                    if (oddNum.test(i)){
                        System.out.print(i+" ");
                    }

                    break;
            }

        }
    }
}
