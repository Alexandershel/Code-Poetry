// Trick or Treat

public class candy
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random chance = new random;
		String request = scan.nextLine();
		String treat, trick;
		
		chance = chance.nextBoolean();
		
		if(request.equals("Trick or Treat!"))
		{
			if(chance == true) System.out.print(treat);
			if(chance == false) System.out.print(trick);
		}
		else
		{
			System.exit(0);
		}
	}
}