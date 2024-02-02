package Rensyuu.program14;
import java.util.Scanner;
public class Mojiretu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("文字列を入力: ");
        String Input = scanner.nextLine();
        StringBuilder result = new StringBuilder(Input);

        if (result.length() >= 11) {
            result.setLength(10);
        }
        System.out.println("結果文字列:" + result.toString());
         
    }
      
}

