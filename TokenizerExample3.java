import java.io.*;
class TokenizerExample3
{
    public static void main() throws IOException
    {
        FileReader file = new FileReader("HelloWorld.java");
        StreamTokenizer str = new StreamTokenizer(file);
        int tokenType = 0;
        int numberOfTokens = -1;
        do
        {
            tokenType = str.nextToken();
            numberOfTokens++;
        }while(tokenType != StreamTokenizer.TT_EOF);
        System.out.println("Number of Tokens = "+numberOfTokens);
    }
}