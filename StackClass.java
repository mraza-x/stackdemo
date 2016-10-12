// Mohammed Raza
// CSC
// Lab 4, #1 (class5)

public class StackClass<T> implements StackADT<T>
{
	private int maxStackSize;

	private int stackTop;

	private T[] list;

	public StackClass()
	{
		maxStackSize = 100;
		stackTop = 0;
		list = (T[]) new Object[maxStackSize];
	}

	public StackClass(int stackSize)
	{
		if(stackSize <= 0)
		{
			System.err.println("The size of the array to "
							+ "implement the stack must be "
							+ "positive.");
			System.err.println("Creating an array of the size 100.");

			maxStackSize = 100;
		}
		else
			maxStackSize = stackSize;


		stackTop = 0;

		list = (T[]) new Object[maxStackSize];
	}

	public void initializeStack()
	{
		for(int i=0; i<stackTop; i++)
			list[i] = null;

		stackTop = 0;
	}

	public boolean isEmptyStack()
	{
		return (stackTop == 0);
	}

	public boolean isFullStack()
	{
		return (stackTop == maxStackSize);
	}

	public void push(T newItem) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();

		list[stackTop] = newItem;

		stackTop++;
	}

	public T peek() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();

		return (T)list[stackTop - 1];
	}

	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();

		stackTop--;
		list[stackTop] = null;
	}

}