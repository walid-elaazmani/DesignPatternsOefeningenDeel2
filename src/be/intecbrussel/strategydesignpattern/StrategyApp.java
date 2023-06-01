package be.intecbrussel.strategydesignpattern;

import java.util.Arrays;

public class StrategyApp {
    public static void main(String[] args) {

        // Test Array
        int[] a = {6,9,8,10,2,0};

        //Unsorted
        ArraySorter arraySorter1 = new ArraySorter("meine sorter", new BubbleSortAlgorithm());
        System.out.println(Arrays.toString(a));

        // Bubble sorted
        System.out.println(Arrays.toString(arraySorter1.sortArray(a)));

        // "Merge sorter", just sorted with stream
        arraySorter1 = new ArraySorter("pp", new MergeSortAlgorithm());

        System.out.println(Arrays.toString(arraySorter1.sortArray(a)));


    }
}
