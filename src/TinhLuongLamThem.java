import java.util.Scanner;

public class TinhLuongLamThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số giờ làm việc: ");
        int soGio = sc.nextInt();

        System.out.print("Nhập lương mỗi giờ (nghìn đồng): ");
        int luongMoiGio = sc.nextInt();

        if (luongMoiGio < 25) {
            System.out.println("CẢNH BÁO: Lương thấp hơn mức lương tối thiểu!");
        }

        if (soGio > 40) {
            System.out.println("CẢNH BÁO: Số giờ làm vượt quá 40 giờ/tuần!");
        }

        int tongLuong = soGio * luongMoiGio;
        System.out.println("Tổng tiền phải trả: " + tongLuong + " nghìn đồng");
    }
}
