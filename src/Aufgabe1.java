import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {

        int[] arrayOne = {1,2,3};
        int[] arrayTwo = {4,5,6};
        int aol = arrayOne.length;
        int atl = arrayTwo.length;
        int[] merged = new int[aol + atl];
        System.arraycopy(arrayOne, 0, merged, 0, aol);
        System.arraycopy(arrayTwo, 0, merged, aol, atl);
        System.out.println(Arrays.toString(merged));
    }

}
