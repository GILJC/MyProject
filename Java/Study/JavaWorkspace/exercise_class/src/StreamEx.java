
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
            new Student("이병헌", 3, 300),
            new Student("송강호", 1, 200),
            new Student("조승우", 2, 100),
            new Student("지진희", 2, 150),
            new Student("홍길동", 1, 200),
            new Student("이순신", 3, 290),
            new Student("강감찬", 3, 180)
      };
      // 학생 이름만 추출하여 List에 저장
      List<String> names = Stream.of(sArr).map(Student::getName)
               .collect(Collectors.toList());
      
      System.out.println(names);
      
      //스트림을 배열로 변환
      Student[] sArr2 = Stream.of(sArr).toArray(Student[]::new);
      
      for(Student s: sArr2)
         System.out.println(s);
      
      //스트림을 Map으로 변환, 학생 이름을 key로
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