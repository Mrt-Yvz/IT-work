package assignments.Ass14_OOP;

import java.util.ArrayList;
import java.util.List;

public class Question14 {

	public static void main(String[] args) {
		
		
		

	}

}

class Item {
	
	private String name;
	private int catalogNumber;
	private int quantity;
	private double price;
	
	public Item(String name, int catalogNumber, int quantity, double price) {
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = quantity;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity +", price=" + price;
	}
		
}

class OnSaleItem extends Item {
	
	private double discount;

	public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
		super(name, catalogNumber, quantity, price-discount);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "{discount =" + discount + ", name = " + getName() + ", price =" + getPrice() + "}";
	}
		
}

class TJMaxx {
	
	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;
	
	public TJMaxx() {
		regularItems = new ArrayList<>();
		onSaleItems = new ArrayList<>();
	}
	
	public void addRegularItem(Item item) {
		regularItems.add(item);
	}
	
	public void addOnSaleItems(OnSaleItem item) {
		onSaleItems.add(item);
	}

	public List<Item> getRegularItems() {
		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}
	
	public int regularItemsCount() {
		return regularItems.size();
	}
	
	public int onSaleItemsCount() {
		return onSaleItems.size();
	}
	
	public List<String> getALLItemsNames(){
		List<String> names = new ArrayList<>();
		for(Item each:regularItems) {
			names.add(each.getName());
		}
		for(OnSaleItem each: onSaleItems) {
			names.add(each.getName());
		}
		return names;
	}
	
	public double getItemPrice(int catalogNumber) {
		List<Item> fullItemList = new ArrayList<>();
		fullItemList.addAll(regularItems);
		fullItemList.addAll(onSaleItems);
		for(Item each:fullItemList) {
			if(each.getCatalogNumber()==catalogNumber) {
				return each.getPrice();
			}
		}
		return 0.0;
	}
	
	public OnSaleItem getOnSaleItem(String name) {
		for(OnSaleItem each:onSaleItems) {
			if(each.getName().equals(name)) {
				return each;
			}	
		}
		return null;
	}
	
	public void removeItem(int catalogNumber) {
		for(Item each:regularItems) {
			if(each.getCatalogNumber()==catalogNumber) {
				regularItems.remove(each);
			}
		}
		for(OnSaleItem each:onSaleItems) {
			if(each.getCatalogNumber()==catalogNumber) {
				onSaleItems.remove(each);
			}
		}
	}
	
	public void buyItem(int catalogNumber) {
		List<Item> fullItemList = new ArrayList<>();
		fullItemList.addAll(regularItems);
		fullItemList.addAll(onSaleItems);
		for(Item each:fullItemList) {
			if(each.getCatalogNumber()==catalogNumber) {
				each.setQuantity(each.getQuantity()-1);
				if(each.getQuantity()==0) {
					removeItem(each.getCatalogNumber());
				}
			}
		}
			
	
	}
	
}