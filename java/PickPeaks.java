import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> values = new HashMap<>();
        List<Integer> position = new ArrayList<>();
        List<Integer> peak = new ArrayList<>();

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i]) {
                if(arr[i] > arr[i + 1]) {
                    position.add(i);
                    peak.add(arr[i]);
                } else if(arr[i] == arr[i + 1]) {
                    for(int j = i; j < arr.length - 1; j++) {
                        if(arr[j] == arr[j + 1]) {
                            continue;
                        }
                        if(arr[j] < arr[j + 1]) {
                            break;
                        }
                        if(arr[j] > arr[j + 1]) {
                            position.add(i);
                            peak.add(arr[i]);
                            break;
                        }
                    }
                }
            }
        }

        values.put("pos", position);
        values.put("peaks", peak);

        return values;
    }

    // [0,1,2,5,1,0] -> pos 3, peaks 3
    // [3,2,3,6,4,1,2,3,2,1,2,3])).to(equal({"pos":[3,7], "peaks":[6,3]})
    // [3,2,3,6,4,1,2,3,2,1,2,2,2,1])).to(equal({"pos":[3,7,10], "peaks":[6,3,2]})
    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{0, 1, 2, 5, 1, 0}));
        System.out.println(getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
        System.out.println(getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1}));
    }
}