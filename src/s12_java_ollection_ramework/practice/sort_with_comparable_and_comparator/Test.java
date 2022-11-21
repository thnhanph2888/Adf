package practice.sort_with_comparable_and_comparator;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kien",30,"HT");
        Student student1 = new Student("Nam",26,"HN");
        Student student2 = new Student("Anh",38,"HT");
        Student student3 = new Student("Tung",38,"HT");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        System.out.println("So sánh bằng comparable: ");
        for (Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sánh bằng comparator: ");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}
