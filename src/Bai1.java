import java.util.Scanner;
public class Bai1 {
    static void main(String[] args) {
        double giaSp;
        double tienThue;
        double tienSauThue;

        Scanner in = new Scanner(System.in);

        System.out.print("Nhap gia san pham: ");
        giaSp = in.nextDouble();

        tienThue = 0.0825 * giaSp;
        tienSauThue = giaSp + tienThue;

        System.out.printf("So tien phai tra cho phan thue la: %.2f\n", tienThue);
        System.out.printf("So tien phai tra sau khi tinh thue la: %.2f\n", tienSauThue);

    }
}
