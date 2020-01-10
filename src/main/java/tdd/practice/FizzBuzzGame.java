package tdd.practice;

public class FizzBuzzGame {
    public String handleNumber(int num) {
        String result = "";
        result = handleModNumber(num);

        if (isContains(num, "3")) {
            if (!isContains(num, "5")) {
                result = "Fizz";
            } else {
                if (isMultiple(num,5)) {
                    result = "Buzz";
                }
                if (isMultiple(num, 7)) {
                    result +="Whizz";
                }
            }
        }
        return result.length() > 0 ? result :Integer.toString(num);
    }

    private String handleModNumber(int num) {
        String result = "";
        if (isMultiple(num, 3)) {
            result = "Fizz";
        }
        if (isMultiple(num, 5)) {
            result += "Buzz";
        }
        if (isMultiple(num, 7)) {
            result += "Whizz";
        }
        return result;
    }

    private boolean isContains(int num, String str) {
        return Integer.toString(num).contains(str);
    }

    private boolean isMultiple(int num, int i) {
        return num % i == 0;
    }
}
