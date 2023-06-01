package be.intecbrussel.observerdesignpattern;

public class ObserverApp {
    public static void main(String[] args) {
        // Create Company and Influencers
        Influencer a = new Influencer("Greta");
        Influencer b = new Influencer("Sarah");
        Company myCompany = new Company();

        // Observers tuning in
        myCompany.addObserver(a);

        Product iPhone = new Product("Iphone");

        // Make new Product
        myCompany.createNewProduct(iPhone);

        myCompany.removeObserver(a);

        myCompany.removeObserver(b);

        myCompany.notifyObservers(iPhone);
    }
}
