import java.util.*;
class countp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int c=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==1)
                c++;
            }
            System.out.println(c%2==0?"YES":"NO");

        }
        sc.close();
    }
}