import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Chi so can nang cua ban la: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gay");
        } else if (bmi < 25) {
            System.out.println("Binh thuong");
        } else if (bmi < 30) {
            System.out.println("Beo");
        } else if (bmi > 30.0) {
            System.out.println("Beo phi");
        }
    }
}