class PowerOf2OrNot
{
    public static void main(String[] args)
    {
        int a=5;
        if((a&(a-1))==0)
        {
            System.out.println("is a power of 2");
        }
        else
        {
            System.out.println("is not a power of 2");
        }
    }
}