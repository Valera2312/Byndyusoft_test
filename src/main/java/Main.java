import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(sumOfTwoMinimalNumbersInArray());
    }
    static long sumOfTwoMinimalNumbersInArray(int ...args) {
        if(args.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int arg : args) {
            if (min > arg) {
                min2 = min;
                min = arg;
            } else if (min2 > arg && arg != min) {
                min2 = arg;
            }
        }
        if(min2 == Integer.MAX_VALUE) {
            min2 = 0;
        }
        return min2 + min;
    }
    static long sumOfTwoMinimalNumbersInArrayStream(int ...args) {

         OptionalInt sumOfTwoNumbers = Arrays.stream(args).sorted().limit(2).distinct().reduce(Integer::sum);
         return sumOfTwoNumbers.orElse(0);

    }
}
