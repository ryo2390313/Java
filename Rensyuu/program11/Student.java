package Rensyuu.program11;

public class Student {
    private String name;
    private String studentId;
    private int japanese;
    private int math;
    private int english;

    public Student(String name, String studentId, int japanese, int math, int english) {
        this.name = name;
        this.studentId = studentId;
        this.japanese = japanese;
        this.math = math;
        this.english = english;
    }

    public double calculateAverage() {
        return Math.floor(((double)(japanese + math + english) / 3) * 100) / 100;  // 小数点第2位以下切り捨て
    }

    public int calculateTotal() {
        return japanese + math + english;
    }

    public String getStudentInfo() {
        return studentId + "番 " + name;
    }
}

 class Main4 {
    public static void main(String[] args) {
        // 学生情報
        Student[] students = {
            new Student("Aさん", "001", 89, 65, 88),
            new Student("Bさん", "002", 80, 95, 64),
            new Student("Cさん", "003", 70, 80, 98)
        };

        // 学生情報を表示
        for (Student student : students) {
            double average = student.calculateAverage();
            System.out.println(student.getStudentInfo() + " 平均点 " + average);
        }
    }
}

