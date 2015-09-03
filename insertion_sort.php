<?php
	
	class insertion_sort
	{
		private $input;
		public function __construct() { }

		public function setInput($inp)
		{
			if (!is_array($inp))
			{
				throw new \Exception("Expected an Array Input");
			}
			else
			{
				$this->input = $inp;
			}
		}

		public function sort()
		{
			$lengthOfInput = count($this->input);
			for ($i = 0; $i < $lengthOfInput; $i++)
			{
				$key;
				try
				{
					if (isset($this->input[$i]) && isset($this->input[$i+1]))
					{
						while(($i >= 0) && ($this->input[$i] > $this->input[$i+1]))
						{
							$key = $this->input[$i];
							$this->input[$i] = $this->input[$i+1];
							$this->input[$i+1] = $key;
							$i -= 1;
						}
					}
				}
				catch(Exception $e) { }
			}
		}

		public function getOutput()
		{
			return $this->input;
		}
	}


	/*
	---------- Example ------

	$isObj = new insertion_sort();
	$isObj->setInput(array(3, 2, 5));
	$isObj->sort();
	$sorted = $isObj->getOutput();
	print_r($sorted);

	*/
?>