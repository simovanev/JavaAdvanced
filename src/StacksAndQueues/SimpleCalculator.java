package StacksAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        ArrayDeque<String> elements = new ArrayDeque<>();
        elements.addAll(List.of(line));
        while (elements.size() > 1) {
            int first = Integer.parseInt(elements.pop());
            String operation=elements.pop();
            int second=Integer.parseInt(elements.pop());
            int result=0;
            switch (operation){
                case "+": result=first+second;
                break;
                case "-":result=first-second;
                break;

            }
                elements.push(""+ result);


        }
        System.out.println(elements.pop());

    }
}
