/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n,y,x,bor=0,c=-1;
		    n=sc.nextInt();
		    y=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		        bor=bor|arr[j];
		    }
		    for(int k=0;k<=y;k++)
		        if((bor|k)==y)
		        {
		            c=k;
		            break;
		        }
		    System.out.println(c);
		}
	}
}
