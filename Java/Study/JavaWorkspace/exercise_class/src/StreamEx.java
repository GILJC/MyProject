
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Student implements Comparable<Student> {
   String name;
   int ban;
   int totalScore;
   
   Student(String name, int ban, int totalScore) {
      this.name = name;
      this.ban = ban;
      this.totalScore = totalScore;
   }
   
   public String toString() {
      return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
   }
   
   String getName( ) { return name; }
   int getBan() { return ban; }
   int getTotalScore() {return totalScore; }
   
   public int compareTo(Student s) {
      return s.totalScore - this.totalScore; 
   }
}



public class StreamEx {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Student[] sArr = {
            new Student("�̺���", 3, 300),
            new Student("�۰�ȣ", 1, 200),
            new Student("���¿�", 2, 100),
            new Student("������", 2, 150),
            new Student("ȫ�浿", 1, 200),
            new Student("�̼���", 3, 290),
            new Student("������", 3, 180)
      };
      // �л� �̸��� �����Ͽ� List�� ����
      List<String> names = Stream.of(sArr).map(Student::getName)
               .collect(Collectors.toList());
      
      System.out.println(names);
      
      //��Ʈ���� �迭�� ��ȯ
      Student[] sArr2 = Stream.of(sArr).toArray(Student[]::new);
      
      for(Student s: sArr2)
         System.out.println(s);
      
      //��Ʈ���� Map���� ��ȯ, �л� �̸��� key��
      Map<String, Student> sMap = Stream.of(sArr)
            .collect(Collectors.toMap(s->s.getName(), p->p));
      
      for(String name: sMap.keySet())
         System.out.println(name + "-" + sMap.get(name));
      
      
      long count = Stream.of(sArr).collect(counting());
      long totalScore = Stream.of(sArr).collect(summingInt(Student::getTotalScore));
      
      System.out.println("count = " + count);
      System.out.println("totalScore = " + totalScore);
      
      totalScore = Stream.of(sArr).collect(reducing(0, Student::getTotalScore, Integer::sum));
      System.out.println("totalScore = " + totalScore);
      
      Optional<Student> topStudent = Stream.of(sArr)
            .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
      
      System.out.println("topStudent = " + topStudent);
      
      IntSummaryStatistics stat = Stream.of(sArr)
            .collect(summarizingInt(Student::getTotalScore));
      
      System.out.println(stat);
      
      String sNames = Stream.of(sArr).map(Student::getName).collect(joining(",", "{", "}"));
      System.out.println(sNames);
   }
}