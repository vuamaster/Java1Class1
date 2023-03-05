package buoi2BTVN;

import java.util.Random;
import java.util.Scanner;

public class bai138 {
    public static void main(String[] args) {
        /*.Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
        nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
        về giá trị là – 1.*/
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("nhập kích thước mảng : ");
        n = in.nextInt();
        in.close();
        if (n<1){
            System.out.print("không hợp lẹ");
            System.exit(0);
        }
        int[] arr = new int[n];
        Random random = new Random();
        for (int i =0;i<n;i++){
            arr[i]= random.nextInt(1000);
        }
        for (int value:arr
             ) {
            System.out.print(value+"\t");
        }
        int check = 0;
        for (int i = 0;i<n;i++){
            if (arr[i]%2 == 0){
                System.out.println("\n vị trí số chẵn đầu tiên là "+ i);
                check++;
                break;
            }
        }
        if (check ==0 ){
            System.out.print("\n -1");
        }
    }
}
