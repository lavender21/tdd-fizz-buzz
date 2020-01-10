package tdd.practice;

public class FizzBuzzGame {
    public String parse(int num) {
        String result = "";
        result = mod3And5And7(num);

        if (isContains(num, "3")) {
            if (!isContains(num, "5")) {
                result = "Fizz";
            } else {
                result = mod5And7(num);
            }
        }
        return result.length() > 0 ? result :Integer.toString(num);
    }

    private String mod5And7(int num) {
        String result = "";
        if (isMultiple(num,5)) {
            result = "Buzz";
        }
        if (isMultiple(num, 7)) {
            result +="Whizz";
        }
        return result;
    }

    private String mod3And5And7(int num) {
        String result = "";
        if (isMultiple(num, 3)) {
            result = "Fizz";
        }
        result += mod5And7(num);
        return result;
    }

    private boolean isContains(int num, String str) {
        return Integer.toString(num).contains(str);
    }

    private boolean isMultiple(int num, int i) {
        return num % i == 0;
    }
}
