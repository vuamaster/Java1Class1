import java.util.Scanner;

public class bai97 {
    public static void main(String[] args) {
        int a,b,c ;
        Scanner in = new Scanner(System.in);
        System.out.print(" nhập cạnh a: ");
        a = in.nextInt();
        System.out.print(" nhập cạnh b: ");
        b = in.nextInt();
        System.out.print(" nhập cạnh c: ");
        c = in.nextInt();
        in.close();

        if( a < 0 || b< 0 || c< 0
                || (a+b < c) || (a+c < b)|| (b+c < a) ) {
            System.out.print("Day khong phai la tam giac");
        }else {
            if((a == b) && (b == c)) {
                System.out.print("Tam Giac Deu.");
            }else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.print("Tam Giac Vuong.");
            }else if(a == b || a == c || b == c) {
                System.out.print("Tam Giac Can.");
            }else {
                System.out.print("Tam Giac Thuong.");
            }
        }
    }
}
