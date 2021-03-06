package com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.service.RestaurantsServiceInterface;
import com.restaurants.entity.RestaurantsEntity;
import com.restaurants.info.Location;
import com.restaurants.info.Restaurants;

@Controller
@RequestMapping("Restaurants")
public class RestaurantController {

	@Autowired
	RestaurantsServiceInterface restaurantsService;

	@RequestMapping("/List")
	public ModelAndView getRestaurants() {
		// TODO Auto-generated method stub

		int i = 0;
		String restaurantId = "" + i;
		List<Restaurants> restaurantsList = new ArrayList<Restaurants>();

		ModelAndView modelAndView = new ModelAndView("RestaurantsList");

		List<RestaurantsEntity> restaurantsEntityList = restaurantsService
				.getAllRestaurants();

		for (RestaurantsEntity restaurantsEntity : restaurantsEntityList) {

			Location location = new Location();
			Restaurants restaurants = new Restaurants();
			// Location Details Translation
			location.setCity(restaurantsEntity.getLocation().getCity());
			location.setContactDetails(restaurantsEntity.getLocation()
					.getContactDetails());
			location.setState(restaurantsEntity.getLocation().getState());
			location.setStreet(restaurantsEntity.getLocation().getStreet());
			location.setZipCode(restaurantsEntity.getLocation().getZipCode());

			// Restaurant details Translation
			restaurants.setHoursOfOperation(restaurantsEntity
					.getHoursOfOperation());
			restaurants.setLocation(location);
			restaurants.setName(restaurantsEntity.getName());
			restaurants.setRating(restaurantsEntity.getRating());
			i++;
			restaurants.setRestaurantID(restaurantId);

		}

		return modelAndView;
	}

	@RequestMapping("/ListById")
	public Restaurants getRestaurantsByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/Add")
	public void addRestaurants() {
		// TODO Auto-generated method stub

		// ModelAndView modelAndView = new ModelAndView(viewName)

	}

	@RequestMapping("/Remove")
	public void removeRestaurants() {
		// TODO Auto-generated method stub
	}

}
