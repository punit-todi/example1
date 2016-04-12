package self.test.example.example1;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {
	private ShoppingBasket basket;
	@Before
	public void setUp() throws Exception {
		basket = new ShoppingBasket();
	}

	@After
	public void tearDown() throws Exception {
		basket = null;
	}

	@Test
	public void testShoppingBasket() {
		Assert.assertEquals(true, basket.getItems() != null);
	}

	@Test
	public void testAddItem() {
		Item item1 = new Item();
		item1.setItemType(ItemType.APPLE);
		item1.setQuantity(5);
		item1.setUnitPrice(0.3);
		basket.addItem(item1);
		Assert.assertEquals(1, basket.getItems().size());
		Item item2 = new Item();
		item2.setItemType(ItemType.BANANA);
		item2.setQuantity(5);
		item2.setUnitPrice(0.22);
		basket.addItem(item2);
		Assert.assertEquals(2, basket.getItems().size());
		Assert.assertEquals(true, basket.getItems().contains(item1));
		Assert.assertEquals(true, basket.getItems().contains(item2));
	}

	@Test
	public void testTotalCost() {
		
		Assert.assertEquals(0.0, basket.totalCost());
		
		Item item1 = new Item();
		item1.setItemType(ItemType.APPLE);
		item1.setQuantity(5);
		item1.setUnitPrice(0.3);
		basket.addItem(item1);
		
		Assert.assertEquals(1.5, basket.totalCost());
		
		Item item2 = new Item();
		item2.setItemType(ItemType.BANANA);
		item2.setQuantity(5);
		item2.setUnitPrice(0.22);
		basket.addItem(item2);
		
		Assert.assertEquals(2.6, basket.totalCost());
	}

}
