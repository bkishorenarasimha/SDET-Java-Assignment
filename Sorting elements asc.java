    public class ElementSort {    
        public static void main(String[] args) 
		{        
            int [] a = new int [] {9,1,8,2,4};     
            int A = 0;
			int len=a.length;
                
            System.out.println("Elements of given array: ");    
            for (int i = 0; i < len; i++) {     
                System.out.println(a[i] + " ");    
            }    
                
            for (int i = 0; i < len; i++) {     
                for (int j = i+1; j < len; j++) {     
                   if(a[i] > a[j]) {    
                       A = a[i];    
                       a[i] = a[j];    
                       a[j] = A;    
                   }     
                }     
            }    
              
            System.out.println();    
            System.out.println("Elements of array sorted in ascending order: ");    
            for (int i = 0; i < len; i++) {     
                System.out.print(a[i] + " ");    
            }    
        }    
    }    