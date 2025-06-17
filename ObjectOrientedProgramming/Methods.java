package ObjectOrientedProgramming;

class Computers
{
	public static void AddMusic()
	{
		int k = 10;

		for (k = 10; k <= 10; k++)
		{
			System.out.println("Print how many songs you want to add to the list");
			System.out.println(k);
			if (k > 10)
			{
				System.out.println("This many songs you cannot add in the list at max you can add 10 songs");
			}
			else
			{
				System.out.println("Thankyou.... Your song is added to the list");
			}
		}
	}

	public String GetMePen(int cost)
	{
		if (cost > 10)
		{
			return ("PEN");
		}
		else
		{
			return ("Nothing");
		}
	}
}

public class Methods
{
	public static void main(String[] args)
	{
		Computers obj = new Computers();
		Computers.AddMusic();

		String str = obj.GetMePen(2);
		System.out.println(str);
	}

}
