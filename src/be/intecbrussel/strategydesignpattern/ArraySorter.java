package be.intecbrussel.strategydesignpattern;

public class ArraySorter {
    private String nameOfSorter;
    private ArraySortingAlgorithm arraySortingAlgorithm;

    public ArraySorter(String name, ArraySortingAlgorithm arraySortingAlgorithm) {
        this.arraySortingAlgorithm = arraySortingAlgorithm;
        this.nameOfSorter = name;
    }

    public int[] sortArray(int[] array){
       return arraySortingAlgorithm.sortArray(array);
    }
}
