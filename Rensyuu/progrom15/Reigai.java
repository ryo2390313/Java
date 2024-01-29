package Rensyuu.progrom15;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Reigai {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
       try {    
        System.out.print("整数１=");
        int x = stdIn.nextInt();

        System.out.print("整数２=");
        int y = stdIn.nextInt();
        if (y == 0) {
          throw new ArithmeticException("0 による割り算です！！");
        }
        double result = (double) x / y;
        System.out.println(x +"/" + y + "=" + result);
      }catch (InputMismatchException e) {
        System.out.println("0 除算例外: " + e.getMessage());
      }catch (Exception e) {
        System.out.println("エラーが発生しました: " + e.getMessage());
      }finally {
        stdIn.close();
            System.out.println("処理終了");
      }    
    }
}
