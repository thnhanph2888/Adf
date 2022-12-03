package src.models.person;

import sun.dc.pr.PRError;

public class Employee extends Person{
    private String level;
    private String position;
    private int wage;

    public Employee(String code, String name, String dayOfBirth, String gender, String id, String phoneNumber
            , String email, String level, String position, int wage) {
        super(code, name, dayOfBirth, gender, id, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
