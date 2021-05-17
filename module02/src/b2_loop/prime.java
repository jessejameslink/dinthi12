package b2_loop;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        //liệt kê tất cả số nguyên tố nhỏ hơn number
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
        int number = scanner.nextInt();
        System.out.println("Prime numbers in turn are: ");
        if (number>=2){
            System.out.println(" "+ 2);
        }
        for (int i = 3;i<= number;i+=2) {
            if (isPrime(i)){
                System.out.println(" "+ i);
            }
        }
    }
    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }else {
            int test =(int) Math.sqrt(number);
            for (int i =2;i<=test;i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;

    }
}
