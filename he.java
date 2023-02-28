import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class he {
    public static void main(String[] args) {
        //viet chuwowng trinh helloworld
        /*comment tren nhieu dong */
        //xuat ra man hinh dong chu xin chao lop java 06
        System.out.print("xin chao lop java nhom 06");
        //cach khai bao bien trong java
        int a;
        // int b = 10;
        // int e,c,d;
        // int f,g = 20;
        String s = "xin chao";
        float f = 0.3f;
        //double d = 0.2;
        //khai bao 2 bien so nguyen va gan gia trij cho no
        // int so1 = 10;
        // int so2 = 20;
        //sau do tinh tong 2 so va xuat ra man hinh
        // int tong = so1 + so2;
        // System.out.print("\nTong cua 2 so la: " + tong);
        // System.out.print("\nTong cua 2 so la: " + (so1+so2));
        //cho phep nhap ky tu tu ban phim
        Scanner sc = new Scanner(System.in);
        // System.out.print("\nnhap vao so thu nhat: ");
        // int n1 = sc.nextInt();
        // System.out.print("\nnhap vao so thu hai: ");
        // int n2 = sc.nextInt();
        // System.out.print("\nTong cua 2 so la: " + (n1+n2));

        // System.out.print("\nnhap vao so thu nhat: ");
        // String s1 = sc.next();
        // String s2 = sc.next();
        // //eps kieu du lieu trong java
        // int i1 = Integer.parseInt(s1);
        // double db = 3.2;
        // int i2 = (int)db;
        //nhap vao 1 so tu ban phim va in ra man hinh xem la so chan hay so le
        //phep chia lay phan nguyen so1/so2
        //phep chia lay phan du so1%so2System.out.print("\nnhap vao so thu nhat: ");
        System.out.print("\nnhap vao so thu nhat: ");
        int n1 = sc.nextInt();
        if(n1%2==0){
            System.out.print("\nn1 laf so chan ");
        }
        else{
            System.out.print("\nn1 la so le ");
        }
        //cho duong trong tam O(10,20) ban kinh r = 10
        //viet chuong trinh nhap vao tu ban phim 1 diem A (x1, y1)
        //xem diem A nam tren, trong, ngoai duong tron
        //sqrt
        int[] o = {10,20};
        int xo=20;
        int yo=30;
        int x1=10;
        int y1=20;
        double d = Math.sqrt((x1-xo)*(x1-xo)+(y1-yo)*(y1-yo));
        
    }
}
