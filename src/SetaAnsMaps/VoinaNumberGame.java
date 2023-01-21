package SetaAnsMaps;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();
        String[] inputFirst = scanner.nextLine().split(" ");
        String[] inputSecond = scanner.nextLine().split(" ");
        for (String item : inputFirst) {
            firstPlayer.add(Integer.parseInt(item));
        }
        for (String input : inputSecond) {
            secondPlayer.add(Integer.parseInt(input));
        }
        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }
            int first=firstPlayer.iterator().next();
            firstPlayer.remove(first);
            int second=secondPlayer.iterator().next();
            secondPlayer.remove(second);
            if (first>second){
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (second > first) {
                secondPlayer.add(first);
                secondPlayer.add(second);
            }else {
                firstPlayer.add(first);
                secondPlayer.add(second);
            }
        }
        if (firstPlayer.size()>secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size()>firstPlayer.size()) {
            System.out.println("Second player win!");
        }else System.out.println("Draw!");

    }
}
