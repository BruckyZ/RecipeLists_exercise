package com.company;

public class Recipe
{
	public String getIngredients()
	{
		return Ingredients;
	}

	public void setIngredients(String ingredients)
	{
		Ingredients = ingredients;
	}

	public String getDirections()
	{
		return Directions;
	}

	public void setDirections(String directions)
	{
		Directions = directions;
	}

	private String Ingredients;
	private String Directions;
}
