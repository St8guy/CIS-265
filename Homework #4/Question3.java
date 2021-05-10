import java.util.*;

public class Question3 {

	public static void main(String[] args) 
	{
		Stack<Integer> mystack = new Stack<>();
		int primes = 50;
		int count = 0;
		for(int i = 2; count < primes; i++)
		{
			if(isPrime(i))
			{
				mystack.push(i);
				count++;
			}
		}
		System.out.println("The first 50 prime numbers in descending order are: ");
		for(int i = 1; !mystack.isEmpty(); i++)
		{
			if(i % 10 == 0)
			{
				System.out.printf("%3d\n", mystack.pop());
			}else
			{
				System.out.printf("%3d ", mystack.pop());
			}
		}
		System.out.println();
	}
	@SuppressWarnings("unused")
	public static boolean isPrime(int n)
	{
		for(int i = 2; i <= (n/2); i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
