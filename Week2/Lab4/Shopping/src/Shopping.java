import java.util.ArrayList;

public class Shopping {
	private ArrayList<String> shoppingList;
	
	
	public Shopping() {
		shoppingList = new ArrayList<>();
	}
	
	public void addItem(String celeb) {
		shoppingList.add(celeb);
	}
	
	public int numberOfItems() {
		return shoppingList.size();
	}
	
	public void showItem(int index) {
		System.out.println(shoppingList.get(index));
	}
	
	public void listItems() {
		for(int i=0 ; i<shoppingList.size() ; i++) {
			System.out.printf("item nr%d is: %s%n", i, shoppingList.get(i));
		}
	}
}
