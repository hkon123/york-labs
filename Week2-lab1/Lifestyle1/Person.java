import java.util.Scanner;
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   System.out.printf("%nYour BMI is %.2f%n", getBMI());
	}
	
	public void promptSetting() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your weight: ");
		setWeight(sc.nextDouble());
		System.out.print("input your height: ");
		setHeight(sc.nextDouble());
		System.out.print("input your weekly alcohol intake: ");
		weeklyAlcholUnits = sc.nextInt();
		System.out.print("input your resting pulse: ");
		setPulse(sc.nextInt());
	}
	
	public double getBMI() {
		return (kgWeight/(cmHeight * cmHeight)*10000);
	}
}
