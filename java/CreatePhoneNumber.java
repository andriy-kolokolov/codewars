public class CreatePhoneNumber {
    // {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} => returns "(123) 456-7890"
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder res = new StringBuilder("(");
        for (int i = 0; i < 3; i++) {
            res.append(numbers[i]);
        }
        res.append(") ");
        for (int i = 3; i < numbers.length; i++) {
            if (i == 6) {
                res.append('-');
            }
            res.append(numbers[i]);
        }
        return res.toString();
    }
}
