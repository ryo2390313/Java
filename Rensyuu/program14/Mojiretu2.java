package Rensyuu.program14;
import java.util.Scanner;
public class Mojiretu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("文字列を２つ入力してください。");

        System.out.print("１つ目の文字列を入力:");
        String firstString = scanner.nextLine();

        System.out.print("２つ目の文字列を入力:");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("違う文字列です。");
        }
    }
}
