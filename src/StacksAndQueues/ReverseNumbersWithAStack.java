package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split("\\s+");
        ArrayDeque<String> number =new ArrayDeque<>();
        for (String element:input){

            number.push(element);
        }
        while (!number.isEmpty()){
            System.out.print(number.pop()+" ");
        }
    }
}
