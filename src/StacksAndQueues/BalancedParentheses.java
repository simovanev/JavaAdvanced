package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character> first = new ArrayDeque<>();

        String input = scanner.nextLine();
        boolean isOk = false;
        for (char symbol : input.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                first.push(symbol);
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (first.isEmpty()){
                    isOk=false;
                    break;
                }
                char openBracket = first.pop();
                if (openBracket == '(' && symbol == ')') {
                    isOk = true;

                } else if (openBracket == '{' && symbol == '}') {
                    isOk = true;

                } else if (openBracket == '[' && symbol == ']') {
                    isOk = true;
                } else {
                    isOk = false;
                    break;
                }

            }


        }
        if (isOk){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}

