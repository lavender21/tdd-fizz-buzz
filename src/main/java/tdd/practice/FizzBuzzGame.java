package tdd.practice;

public class FizzBuzzGame {
    private int num;
    private String output;

    public FizzBuzzGame(int input) {
        num = input;
        output = "";
    }

    public String parse() {
        String defaultValue = Integer.toString(num);

        mod3And5And7();

        if (isContains("3")) handleContain3();
        if (isContains("5")) handleContain5();
        if (isContains("7")) handleContain7();

        return output.length() > 0 ? output : defaultValue;
    }

    private void handleContain5() {
        if (isContains("7")) {
            handleContain7();
        } else {
            mod5And7();
        }
    }

    private void handleContain7() {
        if (isContains("3")) {
            handleContain3();
        } else {
            mod3And7();
        }
    }

    private void handleContain3() {
        output = "Fizz";
    }

    private void mod3() {
        if (isMultiple(3)) {
            output =  "Fizz";
        }
    }

    private void mod5() {
        if (isMultiple(5)) {
            output +=  "Buzz";
        }
    }

    private void mod7() {
        if (isMultiple(7)) {
            output += "Whizz";
        }
    }

    private void mod3And7() {
        output = "";
        mod3();
        mod7();
    }

    private void mod5And7() {
        output = "";
        mod5();
        mod7();
    }

    private void mod3And5And7() {
        output = "";
        mod3();
        mod5();
        mod7();
    }

    private boolean isContains( String str) {
        return Integer.toString(num).contains(str);
    }

    private boolean isMultiple( int i) {
        return num % i == 0;
    }
}
