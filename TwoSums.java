package Leetcode_Problems;
import java.util.*;

public class TwoSums {
    public static void main(String args[]) {

        int nums[] = {15, 7, 2, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                System.out.println("Indices: " + map.get(diff) + ", " + i);
               
            }

            map.put(nums[i], i);
        }

        System.out.println("No solution found");
    }
}