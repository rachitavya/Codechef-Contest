import java.util.*;
class expstp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int N,x1,y1,x2,y2,dir,ind1,ind2,indx,indy;
            N=sc.nextInt();
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();

            dir=(int)(Math.abs(x2-x1)+Math.abs(y2-y1));

            indx=Math.min(Math.min(x1,y1),Math.min(N-x1,N-y1));
            if(Math.min(x1,y1)>Math.min(N-x1,N-y1))
            indx+=1;
            indy=Math.min(Math.min(x2,y2),Math.min(N-x2,N-y2));
            if(Math.min(x2,y2)>Math.min(N-x2,N-y2))
            indy+=1;
            System.out.println((int)Math.min((indx+indy),dir));
            /*if(Math.min(x1,y1)<N/2)
            ind1=Math.min(x1,y1);
            else 
            ind1=N-Math.max(x1,y1)+1;
            if(Math.min(x2,y2)<N/2)
            ind2=Math.min(x2,y2);
            else 
            ind2=N-Math.max(x2,y2)+1;
            ind1+=ind2;
            System.out.println((int)Math.min(ind1,dir)); */
        }
        sc.close();
    }
}