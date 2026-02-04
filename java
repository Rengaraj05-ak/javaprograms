codechef:
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        float n1=sc.nextFloat();
	        float n2=sc.nextFloat();
	        float n3=sc.nextFloat();
	        if(((n1+n2)/2)>n3)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	}}
}
