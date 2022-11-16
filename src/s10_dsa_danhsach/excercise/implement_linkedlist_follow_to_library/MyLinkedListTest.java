package excercise.implement_linkedlist_follow_to_library;

import excercise.implement_arraylist_follow_library_java.Student;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Student> linkedList = new MyLinkedList<>();
        Student student1 = new Student("name1", "33532");
        Student student2 = new Student("name2", "33532");
        Student student3 = new Student("name3", "33532");
        Student student4 = new Student("name4", "33532");
        Student student5 = new Student("name5", "33532");
        Student student6 = new Student("name6", "33532");

        linkedList.addFirst(student1);
        linkedList.addLast(student2);
        linkedList.addLast(student3);
        linkedList.addFirst(student4);
        linkedList.add(2,student5);
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = (Student) linkedList.get(i);
            System.out.println(student.getName());
        }
        linkedList.remove(student5);
        System.out.println("after remove");
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = (Student) linkedList.get(i);
            System.out.println(student.getName());
        }
        MyLinkedList<Student> listClone = new MyLinkedList<>();
        listClone = linkedList.clone();
        System.out.println("linkedList clone: ");
        for (int i = 0; i < listClone.size(); i++) {
            Student student = (Student) listClone.get(i);
            System.out.println(student.getName());
        }
        System.out.println(linkedList.constrains(student4));
        System.out.println(linkedList.constrains(student6));
        System.out.println(linkedList.indexOf(student4));
        System.out.println(linkedList.indexOf(student6));
        System.out.println(linkedList.getFirst().getName());
        System.out.println(linkedList.getLast().getName());
        linkedList.clear();
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = (Student) linkedList.get(i);
            if (student == null){
                System.out.println("null");
            } else {
                System.out.println(student);
            }

        }
    }
}
