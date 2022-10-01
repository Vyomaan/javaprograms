import java.io.*;
class IOEx
{
    public static void main()throws IOException
    {
        FileReader file = new FileReader("names.txt");
        BufferedReader fileInput = new BufferedReader(file);
        String text;
        int i=0;
        while( (text=fileInput.readLine() ) !=null)
        {
            i++;
            System.out.print("Name "+i+" :");
            System.out.println(text);
        }
    }
}