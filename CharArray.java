import java.util.Scanner;
class CharArray
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        char arr[][]=new char[n][n];
        if(n>10)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("Enter three characters");
        char x=sc.next().charAt(0),y=sc.next().charAt(0),z=sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                    arr[i][j]=z;
                else if(j>i)
                {
                    if(i+j<n-1)
                        arr[i][j]=x;
                    else
                        arr[i][j]=y;
                }
                else if(i>j)
                {
                    if(i+j<n-1)
                        arr[i][j]=y;
                    else
                        arr[i][j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}