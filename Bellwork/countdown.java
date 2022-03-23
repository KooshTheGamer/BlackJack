package Bellwork;

public class countdown 
{
    public static void main(String args[])
    {
        int result = countdown(5);
        System.out.println(result);
    }

    public static int countdown(int num)
    {
        System.out.println(num);
        if(num == 1)
        {
            return 0;
        }
        return countdown(num - 1);
    }
}
