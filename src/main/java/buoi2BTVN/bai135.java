package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai135 {
    public static void main(String[] args) {
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
        for (int i = 0;i<n;i++){
            if (arr[i]>0){
                System.out.print("\n gia tri duong dau tien la :"+ arr[i]);
                check++;
                break;
            }
        }
        if (check == 0){
            System.out.print("\n -1");
        }

    }
}
