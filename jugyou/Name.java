
import java.util.Scanner;
public class Name {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("お名前を入力してください：");
        String str = stdIn.next();

        System.out.println("こんにちは" + str + "さん！");
    }
}
