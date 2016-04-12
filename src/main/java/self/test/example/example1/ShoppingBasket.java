package self.test.example.example1;

import java.util.LinkedList;
import java.util.List;

public class ShoppingBasket {

	private List<Item> items; 

	public ShoppingBasket() {
		items = new LinkedList<Item>();
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		this.getItems().add(item);
	}

	public double totalCost() {
		double retValue = 0;
		for(Item i : items) {
			retValue += i.getQuantity() * i.getUnitPrice();
		}
		return retValue;
	}
	
}
