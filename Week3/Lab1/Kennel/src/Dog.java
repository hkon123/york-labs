
public class Dog extends Animal {
	
	private int exerciseTime;
	
	public Dog(String nameIn, int exerciseTimeIn) {
		super(nameIn);
		exerciseTime = exerciseTimeIn;
	}
	
	public void setExerciseTime(int exerciseTimeIn) {
		exerciseTime = exerciseTimeIn;
	}
	
	public int getExerciseTime() {
		return exerciseTime;
	}
	
	public String toString() {
		return super.toString() + "\nExercise Time: " + exerciseTime;
	}
}
