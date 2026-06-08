package Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 2, 8 };
        LargestElement le = new LargestElement();
        System.out.println(le.largestElement(nums));
    }

    public int largestElement(int[] nums) {

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        return largest;
    }
}
    
