package DiceClass;

public class DiceTest 
{

	// Creates two Dice objects and rolls them several times.
	public static void main(String[] args) 
	{
		Dice D1, D2;
		int sum;
		
		D1 = new Dice();
		D2 = new Dice();
		
		D1.Throw();
		D2.Throw();
		System.out.println("Dice One: " + D1 + ", Dice Two: " + D2);
		
		D1.Throw();
		D2.setFaceValue(4);
		System.out.println("Dice One: " + D1 + ", Dice Two: " + D2);
		
		sum = D1.getFaceValue() + D2.getFaceValue();
		System.out.println("Sum: " + sum);
		
		sum = D1.Throw() + D2.Throw();
		System.out.println("Dice One: " + D1 + ", Dice Two: " + D2);
		System.out.println("New sum: " + sum);
	}
}
