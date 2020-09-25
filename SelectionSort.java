import java.util.*;
/**
 * Write a description of class SelectionSort here.
 *
 * @author Henry Grote
 * @version 09/25/2020
 */
public class SelectionSort
{
    public static <T extends Comparable<T>> void selectionSort (T[] input) {
        int n = input.length;
        for (int fill = 0; fill < n - 1; fill++) {
            int posMin = fill;
            for (int nxt = fill + 1; nxt < n; nxt++) {
                if (input[nxt].compareTo(input[posMin]) < 0) {
                    posMin = nxt;
                }
            }
            T tmp = input[fill]; //swaps elements at posMin and fill
            input[fill] = input[posMin];
            input[posMin] = tmp;
        }
    }
}
