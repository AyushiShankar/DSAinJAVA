package Arrays;

import java.util.HashMap;

public class containsDuplicateElement {
        public static void main(String[] args) {
            int[] nums = { 1, 2, 3, 4, 5 , 1};
        System.out.println(containsDuplicate(nums));
    
        }
    
       public static boolean containsDuplicate(int[] nums) {

        int left = 0;
       HashMap<Integer, Integer> map = new HashMap<>();

        while (left < nums.length) {

            if(map.containsKey(nums[left])){
                return true;
            }
            map.put(nums[left], 1);
            left++;
        }

        return false;
    }
    
}
