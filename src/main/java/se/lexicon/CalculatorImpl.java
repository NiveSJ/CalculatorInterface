package se.lexicon;


public class CalculatorImpl implements ICalculator {

    public int[] input() {

        return ICalculator.super.input();
    }


    public void add(int[] add) {
        int i = 0;
        int total = 0;


        for (int value : add) {
            total += add[i];
            i++;
        }
        System.out.println("Addition value is:" + total);
    }

    public void sub(int[] sub) {

        int total = 0;

        total = sub[0] - sub[1];

        for (int i = 2; i < sub.length; i++)
            total = total - sub[i];


        System.out.println("Subtraction value is:" + total);
    }

    public void multiplication(int[] multiply) {

        int total = 0;


        total = multiply[0] * multiply[1];
        for (int j = 2; j < multiply.length; j++) {
            total =total * multiply[j];

        }

        System.out.println("Multiplication value is:" + total);
    }

    @Override
    public void division(int[] division) throws Exception {

        int total = 0;

        total = division[0] / division[1];


        try {

            for (int i = 2; i < division.length; i++)
                total /= division[i];

            System.out.println("Division value is:" + total);
        }
        catch (Exception exception) {
            System.err.println("Arithmetic exception: " + exception.getMessage());

        }


    }


    @Override
    public void exponent(double a, double b) {

        double val = Math.pow(a, b);
        System.out.println("Exponent of a and b :" + val);

    }


}
