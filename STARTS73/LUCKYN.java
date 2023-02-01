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
		    int n=sc.nextInt();
		    int d,c=0;
		    while(n>0)
		    {
		        d=n%10;
		        n/=10;
		        if(d==7)
		        c=1;
		    }
		    System.out.println(c==1?"YES":"NO");
		}
	}
}
