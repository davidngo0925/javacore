import java.util.Scanner;

public class BT2
{
    public static void main(String[] args)
    {
        System.out.print("Bảng cửu chương: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=10; i++)
        {
            System.out.println( n + " x " + i + " = " + n*i );
        }
    }
}
