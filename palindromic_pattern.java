public class palindromic_pattern
{
    public static void main(String arg[])
    {
        int n=5,m;
        for(int i=1;i<=n;i++)
        {
            m=i;
            for(int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print(m+" ");
                m--;
            }
             for(int j=1;j<i;j++)
            {
                System.out.print((j+1)+" ");
               
            }
            System.out.println();
        }
    }
}