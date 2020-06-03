package communication;

import java.time.LocalDate;

public class GroceryItemAddBuffer {
	
	public int userid;
	public String name;
	public int calories;
	public int quantity;
	public String purchaseDate;
	public String expirationDate;
	
	public GroceryItemAddBuffer() {
		//empty no-arg constructor for kryonet
	}
	
	public GroceryItemAddBuffer(int userid, String name, int calories, int quantity, String purchaseDate, String expirationDate) {
		this.userid = userid;
		this.name = name;
		this.calories = calories;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
		this.expirationDate = expirationDate;
	}

	public int getUserid() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}
	
	
}
