public class inverted_half_pyramid
{
    public static void main(String arg[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}