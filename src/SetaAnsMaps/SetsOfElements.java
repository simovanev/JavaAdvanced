package SetaAnsMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer> firstNumbers=new LinkedHashSet<>();
        Set<Integer> secondNumbers=new LinkedHashSet<>();
        int [] sizes= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < sizes[0]; i++) {
            int number= Integer.parseInt(scanner.nextLine());
            firstNumbers.add(number);

        }
        for (int i = 0; i < sizes[1]; i++) {
            int checkNums=Integer.parseInt(scanner.nextLine());
            secondNumbers.add(checkNums);
        }
        for (int item: firstNumbers){
            if (secondNumbers.contains(item)){
                System.out.print(item+" ");
            }
        }
    }
}
