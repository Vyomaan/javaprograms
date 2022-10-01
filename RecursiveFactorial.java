import java.util.Scanner;
class RecursiveFactorial
{
    static double rec_fac(double n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n * rec_fac(n-1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=sc.nextInt();
        double fac = rec_fac(n);
        System.out.println(fac);
    }
}