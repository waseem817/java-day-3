class PowerOf4OrNot
{
    public static void main(String[] args)
    {
        int a=5;
        if((a&(a-2))==0)
        {
            System.out.println("is a power of 4");
        }
        else
        {
            System.out.println("is not a power of 4");
        }
    }
}