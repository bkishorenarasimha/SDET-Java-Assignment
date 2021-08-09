import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {

        int N=0;
		int i = 1;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		N=sc.nextInt();
        while(i <= N)
        {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of N = "+fact);
    }
}