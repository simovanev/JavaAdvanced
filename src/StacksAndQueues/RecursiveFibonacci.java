package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayDeque<Long> fibonachi = new ArrayDeque<>();
        fibonachi.push(1L);
        long firstNum = 1;
        long secondNum = 1;
        long nextNum = 1;
        for (int i = 1; i < n; i++) {

            fibonachi.push(firstNum + secondNum);
            firstNum = secondNum;
            secondNum = fibonachi.peek();
        }
        System.out.println(fibonachi.peek());
    }
}
