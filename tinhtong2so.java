import java.util.Scanner;

public class tinhtong2so {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;

        }
        System.out.println("Tong cac so tu nhien tu 1 den" + num + " la: " + sum);

        System.out.println("------------------------------------");

    }
}
