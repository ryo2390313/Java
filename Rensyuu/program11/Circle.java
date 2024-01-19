package Rensyuu.program11;
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
}