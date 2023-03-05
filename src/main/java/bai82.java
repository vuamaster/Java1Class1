import java.util.Scanner;

public class bai82 {
    //Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
    public static void main(String[] args) {
        float a,b,c ;
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        a = in.nextFloat();
        System.out.print("b = ");
        b = in.nextFloat();
        System.out.print("c = ");
        c = in.nextFloat();
        in.close();
        if (a>b && a>c){
            System.out.print("a là số lớn nhất");
            System.exit(0);
        } else if(b>c){
            System.out.print("b la so lan nhat");
            System.exit(0);
        }
        System.out.print("c la so lơn nhat");
    }
}
