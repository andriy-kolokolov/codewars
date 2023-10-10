import java.util.stream.Collectors;

public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }

    static String doubleChar2(String s) {
        return s.replaceAll(".", "$0$0");
    }

    public static String doubleChar(String s){
        return s.chars()
                .mapToObj(c -> String.valueOf((char) c) + (char) c)
                .collect(Collectors.joining());
    }

    public static boolean isEven(double n) {
        return n % 2 == 0 && n != 0;
    }

    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
