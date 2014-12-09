package DiceClass;
import java.util.Random;

public class Dice 
{
	int numOfDice;
	private int faceValue; // current value showing on the dice
	
	Random random = new Random();

	// Constructor to initialize the number of dice to throw
	public Dice() 
	{
		faceValue = 0;
	}
	
	public int Throw()
	{
		numOfDice = (int)(Math.random() * 3) + 1;
		
		if(numOfDice == 1)
			faceValue = (int)(Math.random() * 6) + 1;
		else if(numOfDice == 2)
			faceValue = (int)(Math.random() * 12) + 1;
		else
			faceValue = (int)(Math.random() * 18) + 1;
		
		return faceValue;
	}
	
	// Face Value mutator
	public void setFaceValue(int value)
	{
		faceValue = value;
	}
	
	// Face value setter
	public int getFaceValue()
	{
		return faceValue;
	}
	
	// Returns a string representation of the dice
	public String toString()
	{
		String result = Integer.toString(numOfDice);
		return result;
	}

}
