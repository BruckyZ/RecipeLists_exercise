package com.company;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)

    {
	// write your code here

        ArrayList<Recipe>Recipelists=new ArrayList<Recipe>();
        Scanner scan= new Scanner(System.in);
        String Add="";

        Recipe recipesteps = new Recipe();
        do
        {
            //Recipe recipesteps = new Recipe();
            System.out.println("Enter the names of the ingredients:");
            recipesteps.setIngredients(scan.nextLine());
            Recipelists.add(recipesteps);
            System.out.println("Do you want to add more Ingredients: Yes/No? ");
            Add=scan.nextLine();
        }
        while (Add.equalsIgnoreCase("Yes"));


            System.out.println("Enter the names of the directions:");
            recipesteps.setDirections(scan.nextLine());
            Recipelists.add(recipesteps);

        for(Recipe steps: Recipelists)
        {
            System.out.println(steps.getIngredients());

            System.out.println(steps.getDirections());
            System.out.println(steps);

        }

    }

}
