package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();
        String[] inputLiquid = scanner.nextLine().split(" ");
        String[] inputIngredients = scanner.nextLine().split(" ");
        for (int i = 0; i < inputLiquid.length; i++) {
            deque.offer(Integer.parseInt(inputLiquid[i]));
        }
        for (int i = 0; i < inputIngredients.length; i++) {
            stack.push(Integer.parseInt(inputIngredients[i]));
        }
        int cake = 0;
        int biscuit = 0;
        int pastry = 0;
        int pie = 0;


        while (!deque.isEmpty() && !stack.isEmpty()) {
            int liquid = deque.pop();
            int ingredient = stack.poll();
            int sum = liquid + ingredient;
            switch (sum) {
                case 25:
                    biscuit++;
                    break;
                case 50:
                    cake++;
                    break;
                case 75:
                    pastry++;
                    break;
                case 100:
                    pie++;
                    break;
                default:
                    stack.push(ingredient + 3);
                    break;
            }

        }
        if (biscuit > 0 && cake > 0 && pastry > 0 && pie > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else System.out.println("What a pity! You didn't have enough materials to cook everything.");

        if (deque.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            while (deque.size()>1) {
                System.out.print(deque.pop() + ", ");
            }
            System.out.println(deque.pop());
        }
        if (stack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");

            while (stack.size()>1) {
                System.out.print(stack.pop() + ", ");

            }
            System.out.println(stack.pop());
        }
        System.out.println("Biscuit: " + biscuit);
        System.out.println("Cake: " + cake);
        System.out.println("Pie: " + pie);
        System.out.println("Pastry: " + pastry);

    }
}
