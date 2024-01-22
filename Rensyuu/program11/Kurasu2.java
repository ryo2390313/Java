package Rensyuu.program11;

public class Kurasu2 {
    
        int x = 100;
        int y = 200;

        void setValus(int x, int y) {
            this.x = x;
            this.y = y;
        }

        
        
        void sum() {
            int total = 0;
            for (int i = x; i <= y; i++) {
                total += i;
            }
            System.out.println(x + "から" + y + "までの合計値は" + total + "です。");
        
        }
    
}

 