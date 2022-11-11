package se.lexicon;

import java.util.Arrays;

/**
 * Calculator Interface
 */
public class App {
    public static void main(String[] args) throws Exception {

        ICalculator calc = new CalculatorImpl();
        //Get option
        int option;
        System.out.println("Enter your option\n 1.Add 2 Subtract 3 Multiply 4 Division 5 Exponent");
        option = calc.scan.nextInt();



            switch (option) {
                // Add
                case 1:
                    int[] input = calc.input();
                    System.out.println(Arrays.toString(input));
                    calc.add(input);
                    break;
                //sub
                case 2:
                    int[] input1 = calc.input();
                    System.out.println(Arrays.toString(input1));
                    calc.sub(input1);
                    break;
                case 3:
                    //multiply
                    int[] input2 = calc.input();
                    System.out.println(Arrays.toString(input2));
                    calc.multiplication(input2);
                    break;
                case 4:
                    //division
                    int[] input3 = calc.input();
                    calc.division(input3);
                    break;
                case 5:
                    System.out.println("Enter two numbers to perform exponent operation");
                    double base=calc.scan.nextDouble();
                    double exp=calc.scan.nextDouble();
                    calc.exponent(base,exp);
                    break;



            }
        }


    }

