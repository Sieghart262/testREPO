import java.util.Random;

public class MangNgauNhien {
    public static void main(String[] args) {
        int[][][] arr = new int[3][4][6];
        Random rd = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    arr[i][j][k] = rd.nextInt(100); // số ngẫu nhiên 0–99
                    if (arr[i][j][k] > max) max = arr[i][j][k];
                    if (arr[i][j][k] < min) min = arr[i][j][k];
                }
            }
        }

        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
