package SetaAnsMaps;

import java.util.*;

public class averageStudentGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int studentsCount= Integer.parseInt(scanner.nextLine());

        Map<String,ArrayList<Double>> studentRecord= new TreeMap<>();
        for (int i = 0; i < studentsCount; i++) {
            String[] input=scanner.nextLine().split(" ");
            String studentName= input[0];
            double grade=Double.parseDouble(input[1]);
            studentRecord.putIfAbsent(studentName,new ArrayList<Double>());
            studentRecord.get(studentName).add(grade);

        }
        for (String student: studentRecord.keySet()){
            double average= 0;
            double total=0;
            for (Double grades: studentRecord.get(student)){
                 total+=grades;
            }
            average=total/studentRecord.get(student).size();
            //("Alex -> 2.00 3.00 (avg: 2.50)");
            System.out.print(student+" -> " );
            studentRecord.get(student).forEach(e-> System.out.printf("%.2f ",e));
            System.out.printf("(avg: %.2f)%n",average);
        }
    }
}
