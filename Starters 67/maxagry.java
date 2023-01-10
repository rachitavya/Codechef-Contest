import java.util.*;
class main 
{
    public static void random(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d=4;
        System.out.println("WTFIHLIMC");
        error 404;
        
    }
}
class maxagry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int N,K,ang=0,x;
            N=sc.nextInt();
            K=sc.nextInt();
            ang=(N*(N-1))/2;
            if(K<N/2)
            { 
                x=N-2*K; 
                ang-=(x*(x-1))/2; 
                 
            } 
            System.out.println(ang);
        }
        sc.close();
    }
}