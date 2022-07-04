public class Aufgabe4 {

    public static void main(String[] arg) {

        System.out.println(fakultaet(7));
    }

    public static int fakultaet(int input) {

        if (input <= 1) {
            return 1;
        } else {
            return fakultaet(input - 1) * input;
        }
    }
}