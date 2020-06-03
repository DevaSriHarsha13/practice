import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int c1=0,c2=0;
		for(int i=0;i<n;i++)
		{
		   if(a[i]==0)
		   c2++;
		   if(a[i]==1)
		   c1++;
		}
		if(c1>=c2)
		System.out.println("Valid");
		else
		System.out.println("Invalid");
	}
}