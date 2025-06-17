package ObjectOrientedProgramming;

class Calculator
{
	int num1 = 21;
	int num2 = 42;

	public int add()
	{
		int result = num1 + num2;
		System.out.println("The sum is: " + result);
		return result;
	}
}

public class Class
{
	public static void main(String[] a)
	{

		Calculator calc = new Calculator();
		calc.add();

	}
}
