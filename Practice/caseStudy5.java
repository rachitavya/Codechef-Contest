import java.util.*;
public class caseStudy5 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,sum=0,min,t;
        int weight[]=new int[10];
        for(int i=0;i<10;i++)
            weight[i]=sc.nextInt();
        for(int i=0;i<9;i++)
        {
            min=i;
            for(int j=i+1;j<10;j++)
                if(weight[j]<weight[min])
                min=j;
            t=weight[i];
            weight[i]=weight[min];
            weight[min]=t;
        }        
        for(int i=0;i<10;i++)
        {
            sum+=weight[i];
            if(sum>700)
            {
                n=10-i;
                break;
            }
        }
        System.out.print("Number of passengers who'll walk = " + n);
        sc.close();
    }
}
