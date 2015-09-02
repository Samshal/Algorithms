class insertion_sort
{
	private int[] input;
	public insertion_sort() { }

	public void setInput(int[] arr)
	{
		this.input = arr;
	}

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

	public void getInput()
	{
		for (int i:this.input)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		insertion_sort isObj = new insertion_sort();
		int[] input = {12, 42, 56, 11, 245, 1};
		isObj.setInput(input);
		isObj.sort();
		isObj.getInput();
	}

}


/*
{1, 3, 4, 5, 6}

input[0] > input[1] && 


*/