import java.util.*;
public class zeroesToEnd
{
    public static void main(String arg[])
    {
        zeroesToEnd ob=new zeroesToEnd();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int c=0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[c++] = arr[i]; 
  
        while (c < n)
            arr[c++] = 0;
        
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        sc.close();
    }
}
