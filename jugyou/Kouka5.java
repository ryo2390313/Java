//Scannerのimport
import java.util.Scanner;
//classの作成
class Kouka5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //点数の入力
        System.out.print("１教科目の点数を入力してください：");
        int score1 = stdIn.nextInt();

        System.out.print("２教科目の点数を入力してください：");
        int score2 = stdIn.nextInt();

        System.out.print("３教科目の点数を入力してください：");
        int score3 = stdIn.nextInt();

        System.out.print("４教科目の点数を入力してください：");
        int score4 = stdIn.nextInt();

        System.out.print("５教科目の点数を入力してください：");
        int score5 = stdIn.nextInt();
        //合計点を計算
        int sum = 0;
        sum += score1;
        sum += score2;
        sum += score3;
        sum += score4;
        sum += score5;
        //平均点を計算
        System.out.printf("合計点%d\n", sum);
        System.out.printf("平均点%f\n", (double)sum / 5);
    }
}