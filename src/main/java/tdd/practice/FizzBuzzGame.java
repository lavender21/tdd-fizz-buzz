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

    public String parse() {
        String result = "";
        result = mod3And5And7();

        if (isContains("3")) {
            if (!isContains("5")) {
                result = "Fizz";
            } else {
                result = mod5And7();
            }
        } else if (isContains("7") && isMultiple(3)) {
            result = "Fizz";
        }
        output = result.length() > 0 ? result : output;
        return result.length() > 0 ? result :Integer.toString(num);
    }

    private String mod5And7() {
        String result = "";
        if (isMultiple(5)) {
            result = "Buzz";
        }
        if (isMultiple( 7)) {
            result +="Whizz";
        }
        return result;
    }

    private String mod3And5And7() {
        String result = "";
        if (isMultiple(3)) {
            result = "Fizz";
        }
        result += mod5And7();
        return result;
    }

    private boolean isContains( String str) {
        return Integer.toString(num).contains(str);
    }

    private boolean isMultiple( int i) {
        return num % i == 0;
    }
}
