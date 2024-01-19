package Rensyuu;
import java.util.Scanner;

public class Circle {
    public static final double PI = 3.1415;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

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