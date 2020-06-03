import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int k=s.nextInt();
		int count=0,flag,index=0,j;
		for(int i=0;i<=n-k;i++)
		{
		   flag=0;
		   for(j=i;j<i+k;j++)
		   {
		       if(a[j]<0)
		       {
		           index=j;
		           flag=1;
		           break;
		       }
		   }
		   if(flag==1)
		   System.out.print(a[index]+" ");
		   else
		   System.out.print("0"+" ");
		}
		
	}
}