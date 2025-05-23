import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int cases = scan.nextInt();
	    
	    for(int c = 0; c < cases; c++){
	        int n = scan.nextInt();
	        int x = scan.nextInt();
	        int s = scan.nextInt();
	        
	        for(int i = 0; i < s; i++){
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            
	            if(a == x){
	                x = b;
	                continue;
	            }
	            
	            if(b == x){
	                x = a;
	            }
	        }
	        System.out.println(x);
	    }
	}
}
