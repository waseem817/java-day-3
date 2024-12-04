class SmallestOf3Num
{
    public static void main(String[] args)
    {
        int a=10;
        int b=2;
        int c=8;
        if((a<b)&&(a<c))
        {
            System.out.println("a is small");
        }
        else if((b<a)&&(b<c))
        {
            System.out.println("b is small");
        }
        else
        {
            System.out.println("c is small");
        }
    }
}
