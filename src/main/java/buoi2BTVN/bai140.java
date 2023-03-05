package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai140 {
    public static void main(String[] args) {
        /*Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực
                (duongnhonhat). Nếu mảng không có giá trị dương thì trả về giá trị
        không dương là – 1.*/
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
        Random random =new Random(300);
        for (int i =0; i<n;i++){
            arr[i]= random.nextDouble() + 2 ;
        }
        for (double value: arr
        ) {
            System.out.print(value+"\t");
        }
        int check = 0;
        double min = arr[0];
        for (int i = 0;i<n;i++){
            if (arr[i]>0){
                if (arr[i]<min){
                    min = arr[i];
                }
                check++;
            }
        }
        if (check == 0){
            System.out.print("\n -1");
        } else {
            System.out.print("số dương nhỏ nhất " + min);
        }
    }
}
