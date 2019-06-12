import java.util.Scanner;

public class sumandaverage {

	public static void main(String[] args) {
   
    int sum,avg;
    sum=0;
    avg=0;
    for(int i=1;i<100;i++)
    {
    	sum=sum+i;
    	avg=sum/2;
    	
    }
System.out.println(sum);
System.out.println(avg);
	}

}
