package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String docName= scanner.nextLine();
        ArrayDeque<String> printerQueue=new ArrayDeque<>();
        while (!docName.equals("print")){
            if (docName.equals("cancel")){
                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                    docName= scanner.nextLine();
                    continue;
                }else System.out.println("Canceled "+printerQueue.poll());
            }else printerQueue.offer(docName);

            docName= scanner.nextLine();
        }
        while (!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }
    }
}
