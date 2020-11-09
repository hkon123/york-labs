
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number you wish to raise to the power");
	   base = sc.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = sc.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}
	
	public int generateLottoNumber(int top) {
		return (int) (Math.random() * top) + 1;
	}
	
	public int getMax(int num1, int num2, int num3) {
		int result = Math.max(num1, num2);
		result = Math.max(result, num3);
		return result;
	}
	
	public void bestOfThree() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input number 1: ");
		int num1 = sc.nextInt();
		System.out.print("input number 2: ");
		int num2 = sc.nextInt();
		System.out.print("input number 3: ");
		int num3 = sc.nextInt();
		
		System.out.printf("the largest number you entered is: %d%n", getMax(num1, num2, num3));
	}
	
	
	
}
