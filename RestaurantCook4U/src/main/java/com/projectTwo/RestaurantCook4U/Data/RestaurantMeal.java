package com.projectTwo.RestaurantCook4U.Data;

public class RestaurantMeal {
	
	private static int idx= 1;
	private String name;
	private String link;
	private String ingredients;
	private int price;
	private String currency;
	
	
	
	public RestaurantMeal(String name, String ingredients, int price, String currency) {
		super();
		this.name = name;
		this.link = "restaurant" + idx++ + ".jpg"; //tu będzie adres linku do obrazka, ktore musza miec nazwie  restaurant1, restaurant2
		this.ingredients = ingredients;
		this.price = price;
		this.currency = String.valueOf(price)+ " " + currency;
	}



	public static int getIdx() {
		return idx;
	}

	public String getName() {
		return name;
	}


	public String getLink() {
		return link;
	}


	public String getIngredients() {
		return ingredients;
	}


	public int getPrice() {
		return price;
	}


	public String getCurrency() {
		return currency;
	}



	@Override
	public String toString() {
		return "RestaurantMeal [name=" + name + ", link=" + link + ", ingredients=" + ingredients + ", price=" + price
				+ ", currency=" + currency + "]";
	}


	

}
