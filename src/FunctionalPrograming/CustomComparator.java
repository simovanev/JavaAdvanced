package FunctionalPrograming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e->Integer.parseInt(e))
                .collect(Collectors.toList());
        Comparator<Integer> compare=((a,b)->{
            if (a%2==0 && b%2!=0){
                return -1;
            } else if (a%2!=0 && b%2==0) {
                return 1;
            }else return a.compareTo(b);
        });
        numbers.stream().sorted(compare).forEach(e-> System.out.print(e+" "));
    }
}
