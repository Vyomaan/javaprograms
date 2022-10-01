import java.io.*;
class IO
{
    static String filename = ("names.txt");
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin = new BufferedReader(isr);
    public static void main()
    {
        try
        {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter outFile = new PrintWriter(bw);
            for(int i=0;i<5;i++)
            {
                System.out.println("Enter name:");
                String name = stdin.readLine();
                outFile.println(name);
                
            }
            outFile.close();
            fw.close();
            bw.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}