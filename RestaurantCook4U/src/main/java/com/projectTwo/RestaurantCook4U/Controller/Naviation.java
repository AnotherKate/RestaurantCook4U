package com.projectTwo.RestaurantCook4U.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class Naviation {
	
	@Controller
	public class Nawigacja {
		
		@GetMapping("/boxes")
		public String toBoxes() {
			return "boxes";
		}
		
		@GetMapping("/contact")
		public String toContact() {
			return "contact";
		}
		
		@GetMapping("/restaurant")
		public String toRestaurant() {
			return "restaurant";
		}
		
		@GetMapping("/catering")
		public String toCatering() {
			return "catering";
		}
		
		
	}

}
