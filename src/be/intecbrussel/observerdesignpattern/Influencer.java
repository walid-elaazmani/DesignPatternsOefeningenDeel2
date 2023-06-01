package be.intecbrussel.observerdesignpattern;

public class Influencer implements Observer {
    private String name;

    public Influencer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println(name + " a New product is out ! :" + product);
    }
}
