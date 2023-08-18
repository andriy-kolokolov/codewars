import java.util.Arrays;
import java.util.stream.Collectors;

public class KataSimple {
    public static void main(String[] args) {
        Arrays.stream(map(new int[]{1, 2, 3, 4, 5})).forEach(x -> System.out.println(x));
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

    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ?
                name + " plays banjo" :
                name + " does not play banjo";
    }
}


