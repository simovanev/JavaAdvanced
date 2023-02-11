package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int s= scanner.nextInt();
        int x= scanner.nextInt();
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int currentNum= scanner.nextInt();
            stack.add(currentNum);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println(0);
            return;
        }
        if (stack.contains(x)){
            System.out.println("true");
        }else System.out.println(Collections.min(stack));

    }
}
