import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(squareDigits(6969));
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
                name + " plays banjo"  :
                name + " does not play banjo";
    }
}


