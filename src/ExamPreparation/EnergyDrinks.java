package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> caffeineStack = new ArrayDeque<>();
        Deque<Integer> energyDrinkQueue = new ArrayDeque<>();
        String[] caffeine = scanner.nextLine().split(", ");
        String[] energyDrink = scanner.nextLine().split(", ");
        int StamatTotalCaffeine = 0;
        for (String input : caffeine) {
            caffeineStack.push(Integer.parseInt(input));
        }
        for (String input : energyDrink) {
            energyDrinkQueue.offer(Integer.parseInt(input));
        }
        while (caffeineStack.size() > 0 && energyDrinkQueue.size() > 0) {
            int currentCaffeine = 0;

            currentCaffeine += caffeineStack.peek() * energyDrinkQueue.peek();

            if (StamatTotalCaffeine + currentCaffeine <= 300) {
                StamatTotalCaffeine += currentCaffeine;
                caffeineStack.pop();
                energyDrinkQueue.poll();
            }else if (StamatTotalCaffeine + currentCaffeine > 300){
                caffeineStack.pop();
                energyDrinkQueue.offer(energyDrinkQueue.poll());
                StamatTotalCaffeine=Math.max(StamatTotalCaffeine-30,0);
            }
        }
        if (energyDrinkQueue.isEmpty()){
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }else {
            String remaining= energyDrinkQueue.stream().map(e->e.toString()).collect(Collectors.joining(", "));
            System.out.printf ("Drinks left: %s%n",remaining);

        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", StamatTotalCaffeine);
    }
}
