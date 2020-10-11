/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class ExperimentController
{
    public static void main (String[] args){
        ExperimentController e = new ExperimentController();
        Random random = new Random(451);
        /*float total=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total=total+e.timeMergeSortReverse(200000,random.nextInt());
        }
        total=total/5; // average execution time
        System.out.println(total);*/
        e.memoryUseMeasurementsInteger(200000,random.nextInt());
        
        ExperimentController e1 = new ExperimentController();
        Random random1 = new Random(5);
        /*float total1=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total1=total1+e1.timeMergeSortReverse(400000,random1.nextInt());
        }
        total1=total1/5; // average execution time
        System.out.println(total1);*/
        e1.memoryUseMeasurementsInteger(400000,random.nextInt());
        
        ExperimentController e2 = new ExperimentController();
        Random random2 = new Random(82);
        /*float total2=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total2=total2+e2.timeMergeSortReverse(600000,random2.nextInt());
        }
        total2=total2/5; // average execution time
        System.out.println(total2);*/
        e2.memoryUseMeasurementsInteger(600000,random.nextInt());
        
        ExperimentController e3 = new ExperimentController();
        Random random3 = new Random(665);
        /*float total3=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total3=total3+e3.timeMergeSortReverse(800000,random3.nextInt());
        }
        total3=total3/5; // average execution time
        System.out.println(total3);*/
        e3.memoryUseMeasurementsInteger(800000,random.nextInt());
        
        ExperimentController e4 = new ExperimentController();
        Random random4 = new Random(4512);
        /*float total4=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total4=total4+e4.timeMergeSortReverse(1000000,random4.nextInt());
        }
        total4=total4/5; // average execution time
        System.out.println(total4);*/
        e4.memoryUseMeasurementsInteger(1000000,random.nextInt());
       
    }
    
    /**
     * Measuring memory use
     */
    public void memoryUseMeasurementsInteger(int numberOfItems, int seed) {
        SelectionSort s = new SelectionSort(); // instanciates sorters
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        MergeSort m = new MergeSort();
        Random r = new Random(seed);
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=r.nextInt();
        }
        int[] copy = array;
        long startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println(startMemory);
        s.sort(copy);
        long endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        
        long deltaMemory = endMemory-startMemory;
        System.out.println(startMemory);
        System.out.println("Selection Sort memory: " + deltaMemory);
        
        copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        b.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Bubble Sort memory: " + deltaMemory);
        
        copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        i.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Insertion Sort memory: " + deltaMemory);
        
        /*copy = array;
        startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        m.sort(copy);
        endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        deltaMemory = endMemory-startMemory;
        System.out.println("Merge Sort memory: " + deltaMemory);*/
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float timeSelectionSortRandom (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortSorted (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortReverse (int numberOfItems, int seed){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public int[] reverse(int a[]) 
    { 
        int n = a.length;
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    }
    
    public float timeInsertionSortRandom (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortSorted (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortReverse (int numberOfItems, int seed){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortRandom (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortSorted (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortReverse (int numberOfItems, int seed){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        int[] array1 = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array1);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortRandom (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortSorted (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortReverse (int numberOfItems, int seed){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        Random random = new Random(seed);// Instance of Random
        int[] array = new int[numberOfItems];
        for(int x = 0; x < numberOfItems; x++)
        {
            array[x]=random.nextInt();
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
}
