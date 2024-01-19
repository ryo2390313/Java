package Rensyuu;
import java.util.Scanner;
public class Goukei {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1から100までの合計を求めます。");
        
        do {
        }while (100 <= 0);

        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("合計は"+ sum +"です。");
    }
}
