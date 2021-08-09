import java.util.Scanner;

    public class RevArray {  
        public static void main(String[] args) {  
			
			int len;
			
			Scanner sc = new Scanner(System.in);
            System.out.println("Length of array: ");
			len = sc.nextInt(); 	
			
			int [] arr = new int[len];
			
            System.out.println("Enter elements of array: ");
            for (int i = 0; i < arr.length; i++) 
			{ 
				arr[i]= sc.nextInt(); 
                System.out.print(arr[i] + " ");  
            }  
            
            System.out.println("Array in reverse order: ");  

            for (int i = arr.length-1; i >= 0; i--) {  
                System.out.print(arr[i] + " ");  
            }  
        }  
    }  