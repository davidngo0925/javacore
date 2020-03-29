import java.util.Scanner;

public class BT1 {
    public static void main(String[] args)
    {
        System.out.print("Vui lòng nhập giá trị A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập giá trị B: ");
        int b = sc.nextInt();
        int tong = a + b;
        int tich = a * b;
        System.out.println("Tổng A và B là: " + tong);
        System.out.println("Tích A và B là: " + tich);
    }
}
