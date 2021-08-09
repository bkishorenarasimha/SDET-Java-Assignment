public class Prime  
{  
	public static void main(String[] args)   
	{  
		System.out.println("First 10 prime numbers "); 	
		for(int b=0,i=1;b<10;i++)  
		{  int a=0;
			for(int j=1;j<=i;j++)  
			{  
				if(i%j==0)  
				a++;  
								}  
				if(a==2)  
			{  
				System.out.println(i);  
				b++;  
			}  
			
		}  
	} 
}