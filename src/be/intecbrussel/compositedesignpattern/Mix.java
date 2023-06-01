package be.intecbrussel.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Mix implements Ingredient{
    private List<Ingredient> listOfIngredients;

    public Mix() {
        listOfIngredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient){
        listOfIngredients.add(ingredient);
    }

    @Override
    public void mix() {
        if(listOfIngredients.isEmpty()){
            System.out.println("empty mixer");
        }
        for (Ingredient listOfIngredient : listOfIngredients) {
            listOfIngredient.mix();
        }
        listOfIngredients.clear();
    }
}
