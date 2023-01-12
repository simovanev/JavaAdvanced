package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> decimal=new ArrayDeque<>();
        if (input==0){
            System.out.println(0);
            return;
        }
        while (input>0){
            decimal.push(input%2);
            input/=2;
        }
        while (!decimal.isEmpty()){
            System.out.print(decimal.poll());
        }
    }
}
