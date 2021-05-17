package b1_introduction_to_java.bai_tap;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("hello "+ name);

//graphical user interface(giao dien do hoa nguoi dung)
        String name2 = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello "+ name2);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"u are "+ age +" year old");

        Double height =Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null,"u are "+height+"cm tall");

    }
}
