import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aufgabe2 {

    public static void main(String[] args) {
        List<String> listToSort = new ArrayList<String>();
        listToSort.add("a");
        listToSort.add("c");
        listToSort.add("b");
        System.out.println(listToSort + " vor dem Sortieren");
        Collections.sort(listToSort);   // Diese Zeile Code reicht zum Sortieren.
        System.out.println(listToSort + " nach dem Sortieren");

        int[] arrayToSort = {3, 4, 1, 9, 8, 2};
        System.out.println(Arrays.toString(arrayToSort) + " vor dem Sortieren");
        Arrays.sort(arrayToSort);   // Diese Zeile Code reicht zum Sortieren
        System.out.println(Arrays.toString(arrayToSort) + " nach dem Sortieren");
    }
}
