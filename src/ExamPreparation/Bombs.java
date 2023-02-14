package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<Integer> effectsQueue= new ArrayDeque<>();
        Deque<Integer> casingsStack= new ArrayDeque<>();

        String[] effects= scanner.nextLine().split(", ");
        for (String input: effects){
            effectsQueue.offer(Integer.parseInt(input));
        }
        String[] casings=scanner.nextLine().split(", ");
        for (String input: casings){
            casingsStack.push(Integer.parseInt(input));
        }
        //•	Datura Bombs: 40
        //•	Cherry Bombs: 60
        //•	Smoke Decoy Bombs: 120
        int daturaBombs=0;
        int cherryBombs=0;
        int smokeDecoyBombs=0;
        boolean haveAllBombs= false;
        while (effectsQueue.size()>0  && casingsStack.size()>0){
            int effect=effectsQueue.peek();
            int casing= casingsStack.pop();
            int sum=effect+casing;
            switch (sum){
                case 40:
                    daturaBombs++;
                    effectsQueue.poll();
                    break;
                case 60:
                    cherryBombs++;
                    effectsQueue.poll();
                    break;
                case 120:
                    smokeDecoyBombs++;
                    effectsQueue.poll();
                    break;
                default:
                    casingsStack.push(casing-5);

            }
            if (daturaBombs>=3 && cherryBombs>=3 && smokeDecoyBombs>=3){
                haveAllBombs=true;
                break;
            }
        }
        if (haveAllBombs){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }else System.out.println("You don't have enough materials to fill the bomb pouch.");
        if (effectsQueue.isEmpty()){
            System.out.println("Bomb Effects: empty");
        }else {
            System.out.print("Bomb Effects: ");
           while (effectsQueue.size()>1){
               System.out.print(effectsQueue.poll()+", ");
           }
            System.out.println(effectsQueue.poll());
        }
        if (casingsStack.isEmpty()){
            System.out.println("Bomb Casings: empty");
        }else {
            System.out.print("Bomb Casings: ");
            while (casingsStack.size()>1){
                System.out.print(casingsStack.pop()+", ");
            }
            System.out.println(casingsStack.pop());
        }
        System.out.println("Cherry Bombs: "+cherryBombs);
        System.out.println("Datura Bombs: "+daturaBombs);
        System.out.println("Smoke Decoy Bombs: "+smokeDecoyBombs);



    }
}
