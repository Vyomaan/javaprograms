import java.util.*;
import java.io.*;
class ScanConsoleApp
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.printf("Input int (eg %4d:)",3501);
            int int_value = sc.nextInt();
            System.out.println("You enetered"+int_value);
            System.out.printf("Input float(eg %5.2f)",2.43);
            float float_val = sc.nextFloat();
            System.out.println("You enetered"+float_val);
            System.out.printf("Input float(eg %6.3e)",4.943e15);
            double double_val = sc.nextDouble();
            System.out.println("You enetered"+double_val);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}