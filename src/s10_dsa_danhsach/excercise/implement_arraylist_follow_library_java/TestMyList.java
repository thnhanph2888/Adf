package excercise.implement_arraylist_follow_library_java;

public class TestMyList {
    public static void main(String[] args) {
        Student studentOne = new Student("join1","0124");
        Student studentTwo = new Student("join2","3024");
        Student studentThree = new Student("join3","3024");
        Student studentFour = new Student("join4","3024");
        Student studentFive = new Student("join5","3024");
        MyList<Student> listStudent = new MyList<>();
        MyList<Student> cloneListStudent = new MyList<>();
        listStudent.add(studentOne);
        listStudent.add(studentTwo);
        listStudent.add(studentThree);
        listStudent.add(9,studentFour);
        System.out.println(listStudent.indexOf(studentFour));
        System.out.println("studentFive is Exist" + listStudent.contains(studentFive));
        System.out.println("studentFour is Exist" + listStudent.contains(studentFour));
        cloneListStudent = listStudent;
        System.out.println("List name clone: ");
        listStudent.remove(0);
        listStudent.disPlayName();
        cloneListStudent.disPlayName();
    }
}
