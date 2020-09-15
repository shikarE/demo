/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cs1
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter the number written by Michael on the chit");

	    int a=sc.nextInt();
	    String A="Michael";
	    System.out.println("Enter the number schosen by Bruce on the chit");
	    String B="Bruce";
	    int b= sc.nextInt();
	    
	    System.out.println( (a>=b?A:B)+" wins the race with "  +(a>=b?a:b)+" points" );
	    
	}
}
