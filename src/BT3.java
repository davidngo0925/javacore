import java.util.Scanner;

public class BT3 {
    public static void main(String[] args)
    {
        System.out.print("Vui lòng nhập giá trị A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập giá trị B: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a* b;
        int phannguyen = a / b;
        int phandu = a % b;
        System.out.println( a + " + " + b + " = " + tong );
        System.out.println( a + " - " + b + " = " + hieu );
        System.out.println( a + " * " + b + " = " + tich );
        System.out.println( a + " / " + b + " = " + phannguyen );
        System.out.println( a + " % " + b + " = " + phandu );
    }
}
