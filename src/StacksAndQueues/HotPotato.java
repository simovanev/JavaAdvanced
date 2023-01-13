package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] kids=scanner.nextLine().split("\\s+");
        int passes= Integer.parseInt(scanner.nextLine());
        ArrayDeque <String> kidsInTheGame=new ArrayDeque<>();
        kidsInTheGame.addAll(List.of(kids));
        while (kidsInTheGame.size()>1){
            for (int i = 1; i <passes ; i++) {
                String rotation=kidsInTheGame.poll();
                kidsInTheGame.offer(rotation);
            }
            System.out.println("Removed "+kidsInTheGame.poll());
        }
        System.out.println("Last is "+kidsInTheGame.poll());
    }
}
