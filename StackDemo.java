// Mohammed Raza
// CSC
// Lab 4, #1 (main)

public class StackDemo
{
	public static void main(String[] args)
	{
		StackClass<Integer> intStack = new StackClass<Integer>(50);

		try
		{
			intStack.push(23);
			intStack.push(45);
			intStack.push(38);
		}

		catch (StackOverflowException sofe)
		{
			System.out.println(sofe.toString());
			System.exit(0);
		}

		System.out.print("intStack elements: ");

		while(!intStack.isEmptyStack())
		{
			System.out.print(intStack.peek() + " ");
			intStack.pop();
		}

		System.out.println();
	}
}
