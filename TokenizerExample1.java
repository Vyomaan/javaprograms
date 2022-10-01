import java.io.*;
import java.util.*;
class TokenizerExample1
{
    static InputStreamReader ip = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ip);
    public static void main()throws IOException
    {
        System.out.println("Input a string");
        String data = br.readLine();
        int n=0;
        StringTokenizer st = new StringTokenizer(data);
        n=st.countTokens();
        System.out.println("Number of tokens = "+n);
        for(int c=0;c<n;c++)
            System.out.println(st.nextToken());
    }
}