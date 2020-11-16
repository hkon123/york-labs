
public class TestAnimal {

	public static void main(String[] args) {
		
		Dog dog = new Dog("fido", 3);
		Cat cat = new Cat("Flax");
		System.out.println(dog);
		System.out.println(cat);
		dog.setExerciseTime(5);
		cat.loseLife();
		System.out.println(dog);
		System.out.println(cat);
		
		for(int i=0;i<8;i++) {
			cat.loseLife();
			System.out.println(cat);
		}
		

	}

}
