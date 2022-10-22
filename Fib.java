import java.util.Scanner;

public class Fib 
{
	public static void main(String[] args) 
	{
		Fib f = new Fib ();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a function");
		int i = sc.nextInt();
		System.out.println("The output of fibonacci function you entered is : " +f.fib(i));
	}
	
	int fib(int n) {
	if (n==1)
	{
		return 0;
	} // 1st Fibonacci is 0
	else if (n==2 || n==3)
	{
		return 1;
	}//2nd & 3rd Fibonacci are 1 and 1 only 
	else 
	{
		return (fib(n-1)+fib(n-2));
	}// calling function recursively for nth fibonacci
}
}	