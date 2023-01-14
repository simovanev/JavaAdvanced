package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwarded = new ArrayDeque<>();

        while (!address.equals("Home")) {
            if (address.equals("back")) {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                    address = scanner.nextLine();
                    continue;
                } else {
                    forwarded.push(history.pop());
                }

            } else if (address.equals("forward")) {
                if (!forwarded.isEmpty()) {
                    history.push(forwarded.poll());
                } else {
                    System.out.println("no next URLs");
                address= scanner.nextLine();
                continue;
                }

            } else {
                history.push(address);
                forwarded.clear();
            }
            System.out.println(history.peek());
            address = scanner.nextLine();
        }

    }
}
