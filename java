codechef:
Average of n1 and n2 is strictly greater than n3.Print YES .Otherwise print NO.
	
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
Time Complexity:
	O(N)
Space Complexity:O(1)

Sample Input:2
	        3 4 5
	   		5 8 9
sample output:
			false
			fasle
