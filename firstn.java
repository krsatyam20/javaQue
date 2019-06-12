import java.util.Scanner;

public class firstn {


		public static void main(String[] args) {
	   
	    int n,sum,avg;
	    sum=1;
	    avg=0;
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("please Entrer n number");
		n=sc.nextInt();
		
	    for(int i=1;i<n;i++)
	    {
	    	sum=sum+i;
	    	
	    	
	    }
	    avg=sum/2;
	System.out.println(sum);
	System.out.println(avg);
		}

	}
