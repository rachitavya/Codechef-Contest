import java.util.*;
public class zeroesToEnd
{
    int[] deletion(int arr[],int x, int n)
    {
        for(int i=x;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
        return arr;
    }

    void show(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String arg[])
    {
        zeroesToEnd ob=new zeroesToEnd();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Initial array - ");
        ob.show(arr,n);

        for(int i=0;i<n;i++)
            if(arr[i]==0)
            arr=ob.deletion(arr,i,n);
        
        System.out.print("\nModified array - ");
        ob.show(arr, n);
        sc.close();
    }
}
