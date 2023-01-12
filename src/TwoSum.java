import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 27th December 2022

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
        return solution;
    }

    public int[] twoSumN(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        System.out.println(Arrays.toString(ts.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 3}, 6)));

        System.out.println(Arrays.toString(ts.twoSumN(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(ts.twoSumN(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(ts.twoSumN(new int[]{3, 3}, 6)));
    }
}
