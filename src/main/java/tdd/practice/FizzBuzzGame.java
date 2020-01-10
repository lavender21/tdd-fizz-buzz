package tdd.practice;

public class FizzBuzzGame {
    private int num;
    private String output;

    public FizzBuzzGame(int input) {
        num = input;
        output = Integer.toString(input);
    }

    public String getOutput() {
        return output;
    }

    public void parse() {
        String init = output;
        output = mod3And5And7();

        if (isContains("3")) {
            if (!isContains("5")) {
                output = "Fizz";
            } else {
                mod5And7();
            }
        } else if (isContains("7")) {
            mod3();
        }
        output = output.length() > 0 ? output : init;
    }

    private void mod3() {
        if (isMultiple(3)) {
            output =  "Fizz";
        }
    }

    private void mod5() {
        if (isMultiple(5)) {
            output =  "Buzz";
        }
    }

    private void mod7() {
        if (isMultiple(7)) {
            output =  "Whizz";
        }
    }

    private void mod5And7() {
        output = "";
        if (isMultiple(5)) {
            output = "Buzz";
        }
        if (isMultiple( 7)) {
            output +="Whizz";
        }
    }

    private String mod3And5And7() {
        String result = "";
        if (isMultiple(3)) {
            result = "Fizz";
        }
        mod5And7();
        result += output;
        return result;
    }

    private boolean isContains( String str) {
        return Integer.toString(num).contains(str);
    }

    private boolean isMultiple( int i) {
        return num % i == 0;
    }
}
