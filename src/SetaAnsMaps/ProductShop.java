package SetaAnsMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String info=scanner.nextLine();
        Map<String,Map<String,Double>> shopRecords=new TreeMap<>();
        while (!info.equals("Revision")){
            String[] data= info.split(", ");
            String shop= data[0];
            String product=data[1];
            double price= Double.parseDouble(data[2]);
            shopRecords.putIfAbsent(shop,new LinkedHashMap<>());
            shopRecords.get(shop).put(product,price);

            info= scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> item : shopRecords.entrySet()) {
            System.out.println(item.getKey()+"->");
            for (Map.Entry<String, Double> subItem : item.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", subItem.getKey(),subItem.getValue());
            }

        }


    }
}
