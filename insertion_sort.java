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
			while(i >= 0 && (i < lengthOfInput))
			{
				if ((lengthOfInput > i + 1) && (input[i] > input[i + 1]))
				{
					key = input[i];
					input[i] = input[i+1];
					input[i+1] = key;
					i--;
				}
			}
		}
	}

	public void getInput()
	{
		for (int i:input)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		insertion_sort isObj = new insertion_sort();
		isObj.setInput(int[] {12, 42, 56, 11, 245, 1});
		isObj.sort();
		isObj.getInput();
	}

}