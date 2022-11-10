package excercise.write_only;

public class Student {
    private String name = "John";
    private String classes = "C09";

    public Student(){
    }

    protected void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }
}
