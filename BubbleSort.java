import java.util.*;

/**
 * An implement of Bubble sort
 * 
 * @author  
 */
public class BubbleSort implements Sorter
{
    /**
     * Sort an array of ints using bubble sort. 
     *
     * @param  a  an array of ints
     */ 
    public void sort (int[] a) {
        if(a != null && a.length > 0){
            int n = a.length;
            for (int i = 0; i< n - 1; i++){
                for (int j = 0; j < n -1 - i; j++){
                    if (a[j+1] < a[j]) 
                    {
                        int tmp = a[j]; 
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }
        }
    }

    /**
     * Sort an array of comparable objects using bubble sort. 
     *
     * @param  a  an array of comparable objects
     */ 
    public <T extends Comparable<T>> void sort (T[] a) {
        if(a != null && a.length > 0){
            int n = a.length;
            for (int i = 0; i< n - 1; i++) {
                for (int j = 0; j < n -1 - i; j++) {
                    if (a[j+1].compareTo(a[j]) < 0) 
                    {
                        T tmp = a[j]; 
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }
        }
    }

    /**
     * Sort an array of objects using comparator. 
     *
     * @param  a  an array of objects
     * @param  c  a comparator object
     */ 
    public <T extends Comparable<T>> void sort (T[] a, Comparator<T> c) {
        if(a != null && a.length > 0){
            int n = a.length;
            for (int i = 0; i< n - 1; i++) {
                for (int j = 0; j < n -1 - i; j++) {
                    if (c.compare(a[j+1], a[j]) < 0) 
                    {
                        T tmp = a[j]; 
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }
        }
    }

}
