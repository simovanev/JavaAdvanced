package SetaAnsMaps;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, Set<String>> playersPower= new LinkedHashMap<>();
        String input= scanner.nextLine();
        while (!input.equals("JOKER")){
            String player= input.split(": ")[0];
            String[] cards=input.split(": ")[1].split(", ");
            playersPower.putIfAbsent(player,new HashSet<>());
            playersPower.get(player).addAll(List.of(cards));




            input= scanner.nextLine();
        }
        for (String player: playersPower.keySet()){
            int totalScore=0;
          for (String cards: playersPower.get(player)){
              Pattern pattern=Pattern.compile("\\d+");
              Matcher matcher= pattern.matcher(cards);
              int powerNum=0;
              int typeNum=0;
              if (matcher.find()){
                  powerNum=Integer.parseInt(matcher.group());

              } else if (cards.startsWith("J")) {
                  powerNum=11;
              } else if (cards.startsWith("Q")) {
                  powerNum=12;
              } else if (cards.startsWith("K")) {
                  powerNum=13;
              } else if (cards.startsWith("A")) {
                  powerNum=14;
              }//(S -> 4, H-> 3, D -> 2, C -> 1).
              if (cards.endsWith("S")){
                  typeNum=4;
              }else if (cards.endsWith("H")){
                  typeNum=3;
              }else if (cards.endsWith("D")){
                  typeNum=2;
              }else if (cards.endsWith("C")){
                  typeNum=1;
              }
              totalScore+=powerNum*typeNum;
          }
            System.out.println(player+": "+totalScore);
        }
    }
}
