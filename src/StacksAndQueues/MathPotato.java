package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kids = scanner.nextLine().split("\\s+");
        int passes = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> kidsInTheGame = new PriorityQueue<>();
        kidsInTheGame.addAll(List.of(kids));
        int counter = 1;
        while (kidsInTheGame.size() > 1) {
            for (int i = 1; i < passes; i++) {
                String rotation = kidsInTheGame.poll();
                kidsInTheGame.offer(rotation);
            }
            if (isPrime(counter)){
                System.out.println("Prime "+kidsInTheGame.peek());
            }else {
                System.out.println("Removed " + kidsInTheGame.poll());

            }
            counter++;
        }
        System.out.println("Last is " + kidsInTheGame.poll());
    }

    private static boolean isPrime(int n) {
        if (n==1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
