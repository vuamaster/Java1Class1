import javax.swing.*;
import java.util.Scanner;

public class bai96 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print(" a = ");
        x = in.nextInt();
        if (x >= 5){
            double fx = 2*Math.pow(x,2) + 5*x + 9;
            System.out.print(" giá trị của biểu thức là f(x) = " + fx);
            System.exit(0);
        }
        double fx = -2*Math.pow(x,2) + 4*x - 9;
        System.out.print(" giá trị của biểu thức là f(x) = " + fx);
    }
}
