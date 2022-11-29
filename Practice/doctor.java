import java.util.*;
class doctor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,n;
        x=sc.nextInt();
        n=sc.nextInt();
        n--;
        System.out.print(n*10-n*x);
        sc.close();
    }
}