package b4_classAndMethods;

public class fanMain {
    public static void main(String[] args) {
        fan quat = new fan();
        quat.setSpeed(3);
        quat.setColor("hồng");
        quat.setOn(true);
        quat.setRadius(10.0);
        String s1 =  quat.toString();
        System.out.println(s1);
    }
}
