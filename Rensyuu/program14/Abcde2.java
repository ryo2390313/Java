package Rensyuu.program14;
import java.util.Scanner;
public class Abcde2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力: ");
        String userInput = scanner.nextLine();

        System.out.println(userInput);

        scanner.close();
    }
}
