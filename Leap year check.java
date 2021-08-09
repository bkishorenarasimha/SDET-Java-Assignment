import java.util.Scanner;

public class LeapYr {    
    public static void main(String[] args) 
	{    
        int n=0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		n = sc.nextInt();
        if((n % 4 ==0) && (n % 100 !=0) || (n % 400==0))
		{  
            System.out.println("you entered leap year");  
        }  
        else
		{  
            System.out.println("you entered non leap year");  
        }  
    }  
}    