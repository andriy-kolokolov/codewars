import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Kyu6 {
    public static void main(String[] args) {
        System.out.println(squareDigits(4551));
    }

    public static int sortDesc(final int num) {
        return Integer.parseInt(
                String.valueOf(num)
                        .chars()
                        .map(Character::getNumericValue)
                        .boxed()  // Convert IntStream to Stream<Integer>
                        .sorted(Comparator.reverseOrder())  // Sort in descending order
                        .map(String::valueOf)
                        .collect(Collectors.joining())
        );
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * x).toArray();
    }

    public static int squareDigits(int n) {
        return Integer.parseInt(
                String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .map(x -> x * x)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
        );
    }
}
