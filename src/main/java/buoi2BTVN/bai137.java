package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai137 {
    public static void main(String[] args) {
        /*Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng
        một chiều các số thực (vitrinhonhat).*/
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang ");
        n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("kích thước mảng ko hợp lệ!");
            System.exit(0);
        }
        double[] arr = new double[n];
        Random random =new Random();
        for (int i =0; i<n;i++){
            arr[i]= random.nextDouble();
        }
        // dung foreach in ra các các phần tử mảng
        for (double value: arr
        ) {
            System.out.print(value+"\t");
        }
        double min = arr[0];
        int l = 0;
        for (int i = 0;i<n;i++){
            if (min >arr[i]){
                min=arr[i];
                l =i;
            }
        }
        System.out.print("\n vị trí phần tử nhỏ nhất mảng  "+l);
    }
}
