import java.util.*;
/**
 * Write a description of class QuickSortRandom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSortRandom extends QuickSorter implements Sorter
{
    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public int pivotLocation(int[] a, int fst, int lst) {
        return (int)(Math.random())*(lst-fst) + fst;
    }
    
    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public <T extends Comparable<T>> int pivotLocation(T[] a, int fst, int lst) {
        return (int)(Math.random())*(lst-fst) + fst;
    }
    
    /**
     * Returns the desired pivot location in the array
     * 
     * @param  a  the array to choose the pivot location in
     * @param  fst  the beginning of valid indicies
     * @param  lst  the end of valid indicies
     * 
     * @return  either first; median of first, middle and last; or a random element, depending on inheritance
     */
    public <T extends Comparable<T>> int pivotLocation(T[] a, int fst, int lst, Comparator<T> c) {
        return (int)(Math.random())*(lst-fst) + fst;
    }
}
