
public class Cat extends Animal {

	private int livesLeft;
	
	public Cat(String nameIn) {
		super(nameIn);
		livesLeft = 9;
	}
	
	public int getLivesLeft() {
		return livesLeft;
	}
	
	public void loseLife() {
		livesLeft--;
		if (livesLeft == 0) {
			System.out.println("The cat is dead!");
		}
	}
	
	public String toString() {
		return super.toString() + "\nLives left: " + livesLeft;
	}
	
	
}
