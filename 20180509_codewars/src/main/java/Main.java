import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        //Run toBinary
        System.out.println(toBinary(57));

        // Run countPositivesSumNegatives with input as parameter
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(countPositivesSumNegatives(input)[0]);
        System.out.println(countPositivesSumNegatives(input)[1]);

        //Run even_or_odd
        System.out.println(even_or_odd(6));

        //Run remove firstFirstAndLastCharacter
        String str = "Michal";
        System.out.println(firstFirstAndLastCharacter(str));

        //Run stringy
        System.out.println(stringy(5));

        //Run pythagoreanTriple
        int[] triple = {3, 5, 4};
        System.out.println(pythagoreanTriple(triple));

        //Run barTriang
        double[] x = {5.33, 2};
        double[] y = {47, 5};
        double[] z = {7, 8};
        System.out.println(barTriang(x, y, z)[1]);
    }

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        // liczenie srodka ciezkosci trojkata
        double xs = ((x[0] + y[0] + z[0]) / 3);
        double ys = ((x[1] + y[1] + z[1]) / 3);
       // zaokraglenie do 4 miejsc po przecinku
        double[] d = {Math.round(xs * 10000) / 10000.0d, Math.round(ys * 10000) / 10000.0d};
        return d;
    }


    public static int pythagoreanTriple(int[] triple) {

/**
 * check if triple is pithagoreian
 * - sort array first
 */

        Arrays.sort(triple);

        return Math.pow(triple[2], 2) == Math.pow(triple[1], 2) + Math.pow(triple[0], 2) ? 1 : 0;
    }

    public static String stringy(int size) {
/**
 * convert size (int) to 101010, e.g. 2 -> 10, 6 -> 101010, 12 -> 101010101010
 * 1) insert data to arraylist
 * 2) use stream to convert arraylist to string
 */

        List<String> lista = new ArrayList<String>();
        for (int i = 0; i < size + 1; i++)
            if (i % 2 == 0) {
                lista.add("1");
            } else
                lista.add("0");

        return lista.stream().map(Object::toString).collect(Collectors.joining());
    }

    public static String firstFirstAndLastCharacter(String str) {
/**
 * method to remove first and last character from input string
 */
        return str.substring(1).substring(0, str.length() - 2);
    }

    public static int toBinary(int n) {
/**
 * Method to convert integer to binary with integer as parameter
 *
 * @param n
 * @return
 */
        n = Integer.parseInt(Integer.toBinaryString(n));
        return n;
    }


    public static int[] countPositivesSumNegatives(int[] input) {
        /**
         * Method with sample array as parameter and return array with two values
         * count of possitive values and sum of negative values
         * when input paramater is empty or null, returns empty array new int[1]
         *
         * @param input
         * @return
         */

        int counter = 0;
        int sum = 0;
        int[] a;

        // Check if array is not empty or null

        if (input == null || input.length == 0) {
            a = new int[1];
        } else {

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0)
                    counter++;
                else
                    sum = sum + input[i];
            }

            a = new int[]{counter, sum};
        }
        return a; //return an array with count of positives and sum of negatives
    }

    public static String even_or_odd(int number) {
        /**
         * Method to check if a number os odd (nieparzysta) or even (parzysta)
         */
        String oddOrEven;
        if (number % 2 == 0) {
            oddOrEven = "Even";
        } else oddOrEven = "Odd";
        return oddOrEven;
    }
}

