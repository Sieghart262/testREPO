import java.util.Scanner;

public class Bai3 {
    static void main(String[] args) {
        double cm;
        double inch;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap do dai(cm): ");
        cm = in.nextDouble();
        inch = cm / 2.54;

        System.out.printf("Do dai(inch): %.2f", inch);
    }
}
