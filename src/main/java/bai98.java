import java.util.Scanner;

public class bai98 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("nhap a ");
        a = in.nextDouble();
        System.out.print("nhap b ");
        b = in.nextDouble();
        System.out.print("nhap c ");
        c = in.nextDouble();
        System.out.print("nhap d ");
        d = in.nextDouble();
        System.out.print("nhap e ");
        e = in.nextDouble();
        System.out.print("nhap f ");
        f = in.nextDouble();
        in.close();

        double D = a * e - d * b;
        double Dx = c * e - f * b;
        double Dy = a * f - d * c;
        if(D == 0) {
            if (Dx + Dy == 0) {
                System.out.print("He phuong trinh vo so nghiem");
            }
            else {
                System.out.print("He phuong trinh vo nghiem");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("He phuong trinh co nghiem (x, y) = (%.1f, %.1f)", x, y);
        }

    }
}
