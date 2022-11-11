package se.lexicon;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public interface ICalculator {

    Scanner scan = new Scanner(System.in);

    void add(int[] add);

    void sub(int[] sub);

    void multiplication(int[] multiply);

    void division(int[] division) throws Exception;

    void exponent(double a, double b);

    default int[] input() {
        int[] input = new int[0];
        String val;
        int i = 0;
        System.out.println("Enter Numbers to perform arithmetic operation and press = once done with input");
        while (scan.hasNext()) {
            val = scan.next();
            if (!(val.charAt(0) == '=')) {

                input = Arrays.copyOf(input, input.length + 1);

                input[i] = Integer.parseInt(val);
                i++;
            } else break;


        }

        return input;
    }


}
