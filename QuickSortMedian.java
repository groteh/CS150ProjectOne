import java.util.*;
/**
 * Sorts an array via quicksort, using the first element as the pivot.
 *
 * @author Henry Grote
 * @version 09/29/2020
 */
public class QuickSortMedian extends QuickSorter implements Sorter 
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
        int result;
        int med = (fst+lst)/2;
        if (/*(a[fst] < a[med] && a[med] < a[lst]) ||*/ (a[lst] < a[med] && a[med] < a[fst])) { //median = middle
            result = med;
        }
        else if ((a[med] < a[fst] && a[fst] < a[lst]) || (a[lst] > a[fst] && a[fst] > a[med])) { //median = first
            result = fst;
        }
        else {
            result = lst;
        }
        return result;
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
        int result;
        if ((a[fst].compareTo(a[(fst+lst)/2]) < 0 && a[(fst+lst)/2].compareTo(a[lst]) < 0) || (a[lst].compareTo(a[(fst+lst)/2]) < 0 && a[(fst+lst)/2].compareTo(a[fst]) < 0)) {
            result = (fst+lst)/2;
        }
        else if ((a[(fst+lst)/2].compareTo(a[fst]) < 0 && a[fst].compareTo(a[lst]) < 0) || (a[lst].compareTo(a[fst]) < 0 && a[fst].compareTo(a[(fst+lst)/2]) < 0)) {
            result = fst;
        }
        else {
            result = lst;
        }
        return result;
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
        int result;
        if ((c.compare(a[fst], a[(fst+lst)/2]) < 0 && c.compare(a[(fst+lst)/2], a[lst]) < 0) || (c.compare(a[lst], a[(fst+lst)/2]) < 0 && c.compare(a[(fst+lst)/2], a[fst]) < 0)) {
            result = (fst+lst)/2;
        }
        else if ((a[(fst+lst)/2].compareTo(a[fst]) < 0 && a[fst].compareTo(a[lst]) < 0) || (a[lst].compareTo(a[fst]) < 0 && a[fst].compareTo(a[(fst+lst)/2]) < 0)) {
            result = fst;
        }
        else {
            result = lst;
        }
        return result;
    }
}
