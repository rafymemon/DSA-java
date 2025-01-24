package ReversePolishNotation;

import java.util.Stack;

import Assingment_Vacations.ArrayStack;

public class RPN {
    public RPN(String[] args) {
        ArrayStack stack = new ArrayStack(args.length);
        for (int i = 0; i < args.length; i++) {
            String input = args[i];
            if (isAnOperator(input)) {
                // Data is in string and we want to convert it in double by using Double.parse
                double y = Double.parseDouble((String) stack.pop());
                double x = Double.parseDouble((String) stack.pop());
                double z = evaluate(x, y, input);
                stack.push(" " + z);
            } // End of if statement
            else {
                stack.push(input);
            }
        }
    }

    public boolean isAnOperator(String s) {
        return (s.length() == 1 && "AMSD".indexOf(s) >= 0);
    }

    public double evaluate(double a, double b, String s) {
        double op = 0; // --> op = output that we want to return
        if (s.equals("A")) {
            op = a + b;
        } else if (s.equals("S")) {
            op = a - b;
        } else if (s.equals("M")) {
            op = a * b;
        } else {
            op = a / b;
        }
        System.out.println(a + " " + s + " " + b + " " + " = " + op);
        return op;
    }

    public static void main(String[] args) {
        String[] a = { "7", "2", "A" }; // {"99","9","9","10","10","D","D","D","D"};
        new RPN(a);
    }

}
