package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai136 {
    public static void main(String[] args) {
//        .Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên
//                (chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang");
        n = in.nextInt();
        in.close();
        if (n<1){
            System.out.println("kích thước mảng ko hợp lệ!");
            System.exit(0);
        }
        int[] arr = new int[n];
        Random random =new Random();
        for (int i =0; i<n;i++){
            arr[i]= random.nextInt(1000);
        }
        // dung foreach in ra các các phần tử mảng
        for (int value: arr
        ) {
            System.out.print(value+"\t");
        }
        boolean check = false;
        for (int i = n-1;i>=0;i--){
            if (arr[i]%2==0){
                System.out.print("\n số chẵn cuối cùng của mảng là :"+ arr[i]);
                break;
            } else {
                check = true;
            }
        }
        if (check){
            System.out.print("\n -1");
        }
    }
}
