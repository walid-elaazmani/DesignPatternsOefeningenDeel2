package be.intecbrussel.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject{
    private List<Product> listOfProducts;
    private List<Observer> observerList;

    public Company() {
        observerList = new ArrayList<>();
        listOfProducts = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers(Product product) {
        for (Observer observer : observerList) {
            observer.update(product);
        }
    }
    public void createNewProduct(Product product){
        listOfProducts.add(product);
        notifyObservers(product);
    }
}
