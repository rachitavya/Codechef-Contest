import java.util.*;
class maxagry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int N,K,ang=0;
            N=sc.nextInt();
            K=sc.nextInt();
            while(K-->0)
            {
                ang+=--N;
            }
            if(N>K)
            ang+=(N-K)*K;
            K--;
            while(K-->0)
            ang+=K;
            System.out.println(ang);
        }
        sc.close();
    }
}