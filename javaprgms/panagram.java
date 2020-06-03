import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next().toLowerCase();
		char str[]=st.toCharArray();
		int count[]=new int[26];
		for(int i=0;i<str.length;i++)
		{
		    count[str[i]-'a']++;
		}
		for(int i=0;i<26;i++)
		{
		    if(count[i]<1)
		    {
		    System.out.println("not a panagram");
		    System.exit(1);
		    }
		}
		System.out.println("yes, it's a panagram");
	}
}
