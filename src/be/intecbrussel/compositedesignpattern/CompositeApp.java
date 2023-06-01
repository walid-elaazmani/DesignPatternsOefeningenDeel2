package be.intecbrussel.compositedesignpattern;

public class CompositeApp {
    public static void main(String[] args) {
        // New Mixer
        Mix mixer = new Mix();

        // Adding ingredients
        mixer.addIngredient(new Apple());
        mixer.addIngredient(new Banana());

        //Mix
        System.out.println("------------------Apple + banana-------------------------");
        mixer.mix();

        //Mixing again
        System.out.println("-------------------Mixer emptied--------------------------");
        mixer.mix();

        //Mixing after adding new ingredients
        System.out.println("----------------------Pear------------------------------------");
        mixer.addIngredient(new Pear());
        mixer.mix();

    }
}
