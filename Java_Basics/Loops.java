// If I want to repeat something we can use loops
// 1. while loop (repeat something until certain case are done)
// 2. do-while loop (repeat something until the task is completed)
// 3. for loop (for a certain cases repeat the things)

public static void main(String[] a)
{
	// let's make a while loop for Hi
	int i = 1;

	while (i <= 10)
	{
		System.out.println("Hi" + "_" + i);
		int j = 1;
		while (j <= 9)

		{
			System.out.println("Hello" + "_" + j);
			j++;
		}
		i++;
	}
	System.out.println("Bye" + "_" + i);   // here as we have declared the value outside the loop we get the value as 11

	// do-while loop
	// If I want to execute the block of code once even it is false then we use do while loop
	int k = 5;

	do
	{
		System.out.println("Hi" + "_" + k);
		k++;
	}
	while (k <= 4);

	// for loop
	// most widely used loop for repetitive task as it is simple and very easy to capture
	for (int l = 0; l <= 5; l++)
	{
		System.out.println("Hi" + "_" + l);
	}
}
