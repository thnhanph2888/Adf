package excercise.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fanOne = new Fan(3, 10, "yellow", true);
        Fan fanTwo = new Fan(2, 5, "blue", false);
        System.out.println(fanOne.toString());
        System.out.println(fanTwo.toString());
    }
}
