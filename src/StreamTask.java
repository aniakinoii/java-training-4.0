import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
                .filter(e -> e % 2 != 0)
                .sorted()
                .toArray();
    }
}