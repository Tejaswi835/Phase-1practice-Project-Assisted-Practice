package longest;
import java.util.*;
public class longestsub {
	public static List<Integer> longestsub(int[] nums) {
    int n = nums.length;
    int[] arr = new int[n];
    int[] prev = new int[n];
    int max = 1;
    int lastIndex = 0;
    for (int i = 0; i < n; i++) {
        arr[i] = 1;
        prev[i] = -1;
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j] && arr[i] < arr[j] + 1) {
                arr[i] = arr[j] + 1;
                prev[i] = j;
                if (arr[i] > max) {
                    max = arr[i];
                    lastIndex = i;
                }
            }
        }
    }
    List<Integer> list = new ArrayList<>();
    while (lastIndex != -1) {
        list.add(nums[lastIndex]);
        lastIndex = prev[lastIndex];
    }
    List<Integer> reversedList = new ArrayList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
        reversedList.add(list.get(i));
    }
    return reversedList;
}
public static void main(String[] args) {
	        int[] numbers = {9,8,7,4,5,6,99};
	        List<Integer> list = longestsub(numbers);
	        
	        System.out.println("Longest Increasing Subsequence: " + list);
	    }
}
