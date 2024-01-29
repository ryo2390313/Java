package Rensyuu.program14;

import java.util.Scanner;

public class Abcde3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("文字列を入力: ");
        
        String Input = scanner.nextLine();

        System.out.println("入力された文字列: " + Input);
        
        int length = Input.length();
        System.out.println(" 入力された文字数は " + length + "です。");
       
        scanner.close();
    }
}
