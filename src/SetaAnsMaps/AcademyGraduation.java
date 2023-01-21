package SetaAnsMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        Map<String,Double> student=new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String name= scanner.nextLine();
            double[] grades= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double averageGrade=Arrays.stream(grades).sum()/ grades.length;
            student.put(name,averageGrade);
            System.out.printf("%s is graduated with %f%n",name,averageGrade);

        }//George is graduated with 4.375

    }
}
