import java.util.Scanner;

public class NgayTrongTuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số (1-7): ");
        int n = sc.nextInt();

        switch (n) {
            case 1: System.out.println("Thứ hai"); break;
            case 2: System.out.println("Thứ ba"); break;
            case 3: System.out.println("Thứ tư"); break;
            case 4: System.out.println("Thứ năm"); break;
            case 5: System.out.println("Thứ sáu"); break;
            case 6: System.out.println("Thứ bảy"); break;
            case 7: System.out.println("Chủ nhật"); break;
            default: System.out.println("Số không hợp lệ!");
        }
    }
}
