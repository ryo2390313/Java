package Rensyuu.program11;

public class Kurasu2 {
    class Rin {
        private int x;
        private int y;

        void setValus(int x, int y) {
            this.x = x;
            this.y = y;
        }

        
        int getX() {
            return x;
        }
        int getY() {
            return y;
        }

        int sum() {
            int total = 0;
            for (int i = x; i <= y; i++) {
                total += i;
            }
            return total;
        }
    }
}

 