package Rensyuu.program11;

public class Kurasu {
    public static void main(String[] args) {
        Main10 e = new Main10();
        e.syuryou();
    }
    
}

 class Main10 {
    static int x = 100;
    static int y = 200;
    void syuryou(){
        int i = 0;
        int w = x;
        for (int a = 0; x <= y; x++){
            a+=x;
            i=a;

        }
        System.out.println("100から200までの合計値は"+i+"です。");
    }
    
        
    
    
}