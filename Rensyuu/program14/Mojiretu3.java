package Rensyuu.program14;
import java.util.Scanner;
public class Mojiretu3 {
    public static void main(String[] args) {
        
        String str1 = "東京都千代田区";
        String str2 = "神田神保町";
        
        StringBuffer bf = new StringBuffer(str1);
        bf.append(str2);

        System.out.println(bf.toString());
    }
}
