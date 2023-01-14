package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayDeque<Integer> sequence=new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            String command= scanner.nextLine();
            if (command.startsWith("1")){
                sequence.push(Integer.parseInt(command.split("\\s+")[1]));
            } else if (command.equals("2")) {
                sequence.pop();
            } else if (command.equals("3")) {
                System.out.println(Collections.max(sequence));
            }
        }
    }
}
