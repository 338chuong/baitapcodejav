package java1;

import java.util.Scanner;

public class java1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen: ");
		n = sc.nextInt();
		int tong = 0;
		while (n > 0) {
			tong = tong + n % 10;
			// lay ra phan nguyen
			int n1 = n / 10;
			n = n1;
		}
		System.out.println("Tong cac chu so nguyen la: " + tong);
		System.out.println("---------------------------------");
	}
}
