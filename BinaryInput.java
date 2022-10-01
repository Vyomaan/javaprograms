import java.io.*;
class BinaryInput
{
    static String fileName = "stu.dat";
    public static void main()
    {
        boolean EOF = false;
        try
        {
            FileInputStream fr= new FileInputStream(fileName);
            DataInputStream dr = new DataInputStream(fr);
            while(!EOF)
            {
                try
                {
                    int rno;
                    float marks;
                    rno = dr.readInt();
                    System.out.println("Roll no : "+ rno);
                    marks = dr.readFloat();
                    System.out.println("Marks :"+marks);
                }
                catch (EOFException el)
                {
                    System.out.println("End of file");
                    EOF= true;
                    break;
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("File not Found");
        }
    }
}