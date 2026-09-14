import java.util.Scanner;

public class Bai2 {
    static void main(String[] args) {
        int gioLamViec;
        double tienMoiGio;
        double tienPhaiTra;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so gio lam viec: ");
        gioLamViec = in.nextInt();
        System.out.print("Nhap so tien tra cho moi gio lam viec: ");
        tienMoiGio = in.nextDouble();
        tienPhaiTra = gioLamViec *  tienMoiGio;

        System.out.printf("So tien phai tra cho nhan vien la: %.2f", tienPhaiTra);

    }
}
