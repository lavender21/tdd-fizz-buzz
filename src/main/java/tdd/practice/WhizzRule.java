package tdd.practice;

public class WhizzRule extends Rule {
    private final String WHIZZ = "Whizz";

    public String match(int num) {
        if (isContains(num, BUZZ_NUM) && notContains(num, WHIZZ_NUM)) {
            return multipleWhizzNum(num);
        }
        if(notContains(num,FIZZ_NUM)) {
            return multipleWhizzNum(num);
        }
        return "";
    }

    private String multipleWhizzNum(int num) {
        return isMultiple(num, WHIZZ_NUM) ? WHIZZ : "";
    }
}
