package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai134 {
    public static void main(String[] args) {
        //.Viết hàm tìm “giá trị lớn nhất” trong mảng một chiều số thực (lonnhat).
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang ");
        n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("kích thước mảng ko hợp lệ!");
            System.exit(0);
        }
        double arr[] = new double[n];
        Random random =new Random();
        for (int i =0; i<n;i++){
            arr[i]= random.nextDouble();
        }
        for (double value: arr
        ) {
            System.out.print(value+"\t");
        }
        double max = arr[0];
        for (int i = 0;i<n;i++){
            if (max <arr[i]){
                max=arr[i];
            }
        }
        System.out.print("\n gia tri lon nhat trong mang la "+max);

    }
}
