import java.util.*;
class kngtor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,m;
        while(t-->0)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            System.out.println(n*5+m*7);
        }
        sc.close();
    }
}