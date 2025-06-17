package Java_Basics;

class Conditional_statements
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;

		// basic if else conditions
		if (a * b == 201)
		{System.out.println("Yes, Indeed");}
		else
		{System.out.println("Oops! Something went wrong.");}

		// multiple statements and curly brackets
		int x = 21123;
		int y = 21100;

		if (x > y && x == 21123)
		{
			System.out.println("Well The T AND T MAKES T");
			System.out.println("HELLO BTW");
		}
		else
		{
			System.out.println("Well The T AND F MAKES F");
			System.out.println("Nice to meet you, Bye");
		}

		// Multiple conditions checking
		int s = 12;
		int t = 13;
		int u = 11;

		// Checking which of the three numbers is greater or smaller
		if (s > t && s > u)
		{System.out.println(s);}
		else if (t > s)   // checking for 1 condition as u is already smaller than s
		{
			System.out.println(t);
		}
		else
		{System.out.println(u);}

		// Single line if-else statement
		// Ternary operator
		// For short assignment we can use them to reduce the code
		int n = 20;
		int result = n % 2 == 0 ? 10 : 20;
		System.out.println(result);
	}
}
