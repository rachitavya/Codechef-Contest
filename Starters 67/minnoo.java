import java.util.*;
class minnoo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println((int)Math.floor(n/2));
        }
        sc.close();
    }
}