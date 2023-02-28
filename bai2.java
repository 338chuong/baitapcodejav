import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //nhap vao 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen: ");
        // int n = sc.nextInt();
        // //tinh tong cac chu so trong so nguyen do
        // //vi du: 57 = 5 + 7, 976 = 9 + 7 + 6
        // //while, do while
        // int tong = 0;
        // while(n>0){
        //     tong = tong + n%10;
        //     //tong += n%10
        //     //lay ra phan nguyen
        //     int n1 = n/10;
        //     n = n1;
        // }
        // System.out.print("Tong cac chu so trong so nguyen la: " + tong);
        // //khai bao mang trong java
        // String[] tenmang1;
        // int songuyen[];
        System.out.print("nhap vao so tu ban phim: ");
        String c = sc.next();
        char s[] = c.toCharArray();
        int t = 0;
        //chartoarray
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
            t = t + Character.getNumericValue(s[i]);
            //Integer.parseInt(s[i]);
        }
        //nhap vao nam sinh tu ban phim
        //tinh so tuoi 
        //neu < 10 tuoi hoc tieu hoc
        //neu 10 - 15 tuoi hoc trung hoc
        //neu tu 16 - 18 hocj pho thong
        //tren 18 hoc dai hocj
        //su dung switch case
        System.out.print("Nhap vao nam sinh: ");
        int ns = sc.nextInt();
        int tuoi = 2023 - ns;
        switch(tuoi){
            case 10:
                System.out.print("hoc tieu hoc");
        }
    }
}
