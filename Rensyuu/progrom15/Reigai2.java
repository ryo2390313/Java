package Rensyuu.progrom15;
import java.util.Scanner;
public class Reigai2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");
           
                int num = scanner.nextInt();
                
                if (num % 2 == 0) {
                    System.out.println(num + " は偶数");
                } else {
                    System.out.println(num + " は奇数");
                }
        } catch (Exception e) {
            System.out.println("整数と認識できません!!");
        } finally {
            scanner.close();
        }
    }
}
