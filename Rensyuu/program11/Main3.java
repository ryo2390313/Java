package Rensyuu.program11;
import Rensyuu.program11.Kurasu2.Rin;
public class Main3 {
    public static void main(String[] args){
    Kurasu2 kurasu2Instance = new Kurasu2();
    
    Rin  rin = kurasu2Instance.new Rin();
    
    int x = 100;
    int y = 200;
    rin.setValus(x, y);

    int total = rin.sum();

    System.out.println(rin.getX() + "から" + rin.getY() + "までの合計値は" + total + "です。");
    
 }
}
