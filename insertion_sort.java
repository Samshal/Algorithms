import java.util.Scanner;
class insertion_sort
{
	private int[] input;

	/* ----- CONSTRUCTOR ------ */
	public insertion_sort() { }

	/* ----- ACCEPTS AN ARRAY OF VALUE TO SORT ---- */
	public void setInput(int[] arr)
	{
		this.input = arr;
	}

	/* ---- SORTS AN ARRAY USING THE INSERTION SORT ALGORITHM --- */
	public void sort()
	{
		int lengthOfInput = this.input.length;
		for (int i = 0; i < lengthOfInput; i++)
		{
			int key;
			try
			{
				while((i >= 0) && (this.input[i] > this.input[i+1]))
				{
					key = this.input[i];
					this.input[i] = this.input[i+1];
					this.input[i+1] = key;
					i -= 1;
				}
			}
			catch(Exception e) { }
		}
	}


	/* ---- RETURNS THE SORTED ARRAY ---- */
	public void getOutput()
	{
		for (int i:this.input)
		{
			System.out.print(i+" \t");
		}
	}


	/* ----- A METHOD FOR ACCEPTING USER DATA ---- */
	protected int[] accept()
	{
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("How many items do you want to sort: ");
		int length = scannerObj.nextInt();
		int[] input = new int[length];
		for (int i=1; i <= length; i++)
		{
			System.out.print("Enter The "+ i+" number: \t");
			input[i - 1] = scannerObj.nextInt();
		}

		return input;
	}


	/* --- APPLICATION ENTRY POINT ----- */
	public static void main(String[] args)
	{
		insertion_sort isObj = new insertion_sort();
		int[] input = isObj.accept();
		isObj.setInput(input);
		isObj.sort();
		System.out.print("\n\nResult: "); isObj.getOutput();
	}

}