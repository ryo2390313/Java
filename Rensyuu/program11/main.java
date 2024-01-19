package Rensyuu.program11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力: ");
        int radiusInput = scanner.nextInt();

        Circle circle = new Circle(radiusInput);

        double circumference = circle.calculateCircumference();
        System.out.println("円周の長さは " + String.format("%.3f", circumference) + " です。");

        double area = circle.calculateArea();
        System.out.println("円の面積は " + String.format("%.3f", area) + " です.");
        
        scanner.close();
    }
}
