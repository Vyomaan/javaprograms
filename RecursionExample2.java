class RecursionExample2
{
    static int c=0;
    static void p()
    {
        System.out.println("Hey");
        c++;
        if(c<=5)
        {
            p();
        }
    }
    static void main()
    {
        p();
        
    }
}