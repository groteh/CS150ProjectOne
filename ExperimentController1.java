
/**
 * Write a description of class ExperimentController1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ExperimentController1
{
    public static void main(String[] args){
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrestuvwxyz0123456789";
    
        ExperimentController1 e = new ExperimentController1();
        float total=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total=total+e.timeBubbleSortSorted(string,50000);
        }
        total=total/5; // average execution time
        System.out.println(total);
        
        ExperimentController1 e1 = new ExperimentController1();
        float total1=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total1=total1+e1.timeInsertionSortReverse(string,100000);
        }
        total1=total1/5; // average execution time
        System.out.println(total1);
        
        ExperimentController1 e2 = new ExperimentController1();
        float total2=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total2=total2+e2.timeInsertionSortReverse(string,150000);
        }
        total2=total2/5; // average execution time
        System.out.println(total2);
        
        ExperimentController1 e3 = new ExperimentController1();
        float total3=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total3=total3+e3.timeInsertionSortReverse(string,200000);
        }
        total3=total3/5; // average execution time
        System.out.println(total3);
        
        ExperimentController1 e4 = new ExperimentController1();
        float total4=0;
        // for loop that runs multiple tests of timeAppend method
        for(int i=0;i<5;i++){
            // calculating sum
            total4=total4+e4.timeInsertionSortReverse(string,250000);
        }
        total4=total4/5; // average execution time
        System.out.println(total4);
        
    }
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ExperimentController1
     */
    public ExperimentController1()
    {
        // initialise instance variables
    }

    public float timeSelectionSortRandom(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortSorted(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeSelectionSortReverse(String str,int numberOfItems){
        SelectionSort s = new SelectionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public String[] reverse(String a[]) 
    { 
        int n = a.length;
        String[] b = new String[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    }
    
    public float timeBubbleSortRandom(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortSorted(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeBubbleSortReverse(String str,int numberOfItems){
        BubbleSort s = new BubbleSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortRandom(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortSorted(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeInsertionSortReverse(String str,int numberOfItems){
        InsertionSort s = new InsertionSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortRandom(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortSorted(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time
        return stopTime - startTime; // Returning execution time
    }
    
    public float timeMergeSortReverse(String str,int numberOfItems){
        MergeSort s = new MergeSort(); // Instance of RandomIntegersContainer
        String[] array = new String[numberOfItems];
        String randomString="";
        for(int x = 0; x < numberOfItems; x++)
        {
            Random size = new Random();
            Random index = new Random();
            for(int i=0;i<size.nextInt(20);i++){
                randomString = randomString + str.charAt(index.nextInt(str.length()));
            }
            
            array[x]=randomString;
            randomString="";
        }
        s.sort(array);
        array = reverse(array);
        long startTime = System.currentTimeMillis(); // Recording starting time
        s.sort(array);
        long stopTime = System.currentTimeMillis(); // Recording ending time

        return stopTime - startTime; // Returning execution time
    }
}
