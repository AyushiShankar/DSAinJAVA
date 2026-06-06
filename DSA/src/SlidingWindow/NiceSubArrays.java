package SlidingWindow;

public class NiceSubArrays{

    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums, k)-numberOfSubarrays(nums, k-1));
    }

        public static int numberOfSubarrays(int[] nums, int k){
        int left = 0;
        int oddcount = 0;
        int right = 0;
        int sum =0 ;

        while(right < nums.length){
            if(nums[right]%2==1){
                sum+=nums[right];
                oddcount++;
            }
            if(sum > k){
               sum -= nums[left];
                left++; 
            }
             if(sum <= k){
                oddcount = oddcount + (right - left + 1);
             }

            right++;
        }

        return oddcount;


    }
}