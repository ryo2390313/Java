package Rensyuu.progrom15;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Reigai {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
    while (true)
      try {    
        System.out.print("整数１=");
        int x = stdIn.nextInt();

        System.out.print("整数２=");
        int y = stdIn.nextInt();
        
        System.out.println(x +"/" + y + "=" +(x / y));
      } catch (InputMismatchException e) {
        System.out.println("0による割り算です!!");
        String s = stdIn.next();
      }finally {
        
      }

        
    }
}
