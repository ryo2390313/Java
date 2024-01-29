package Rensyuu.progrom15;
import java.util.Scanner;
public class Reigai {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
       try {    
        System.out.print("整数１=");
        int x = stdIn.nextInt();

        System.out.print("整数２=");
        int y = stdIn.nextInt();
        // if (y == 0) {
        //   throw new ArithmeticException("0 による割り算です！！");
        // }
        double result =  x / y;
        System.out.println(x +"/" + y + "=" + result);
      }catch (ArithmeticException e) {
        System.out.println("0による割り算です。");
      }finally {
        stdIn.close();
            System.out.println("処理終了");
      }    
    }
}
