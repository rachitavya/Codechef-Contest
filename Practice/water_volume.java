import java.util.*;
public class water_volume 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int max=0,vol,p1=0,p2=0;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                vol=Math.min(arr[i], arr[j])*(int)Math.abs(arr[i]-arr[j]);
                if(vol>max)
                {
                    max=vol;
                    p1=arr[i];
                    p2=arr[j];
                }
            }
        }
        System.out.println("Best pair is ("+p1+","+p2+")");
        sc.close();
    }
}
