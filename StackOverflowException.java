// Mohammed Raza
// CSC
// Lab 4, #1 (class2)

public class StackOverflowException extends StackException
{
	public StackOverflowException()
	{
		super("Stack Overflow");
	}
	
	public StackOverflowException(String msg)
	{
		super(msg);
	}
}