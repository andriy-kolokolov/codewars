import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        Arrays.stream(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{1, 3})).forEach(System.out::println);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0) return new int[]{};

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        Arrays.stream(a).forEach(arr1::add);
        Arrays.stream(b).forEach(arr2::add);

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i).equals(arr2.get(j))) {
                    res.add(arr1.get(i));
                }
            }
        }

        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
