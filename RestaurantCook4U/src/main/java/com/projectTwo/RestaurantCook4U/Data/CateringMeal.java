package com.projectTwo.RestaurantCook4U.Data;

public class CateringMeal {
	
	private static int idx= 1;
	private String name;
	private String link;
	private String ingredients;
	private int price;
	private String currency;
	
	
	
	public CateringMeal(String name, String ingredients, int price, String currency) {
		this.name = name;
		this.link = "catering" + idx++ + ".jpg"; //tu będzie adres linku do obrazka, ktore musza miec nazwie  catering1, catering2
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



}
