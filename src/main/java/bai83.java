import java.util.Scanner;

public class bai83 {
    public static void main(String[] args) {
        /*Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
        dấu hay không.*/
        float a,b ;
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextFloat();
        System.out.print("b = ");
        b = in.nextFloat();
        if (a*b > 0){
            System.out.print("hai số thực cùng dấu");
            System.exit(0);
        }
        System.out.print("hai số thực trái dấu");
    }
}
