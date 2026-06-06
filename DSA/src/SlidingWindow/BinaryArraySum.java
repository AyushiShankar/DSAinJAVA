package SlidingWindow;

public class BinaryArraySum {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 1 };
        int k = 2;
        System.out.println(maxOnes(arr, k)-maxOnes(arr, k-1));
    }

    public static int maxOnes(int[] arr, int k) {

        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        if (k < 0)
            return 0;
        while (right < arr.length) {

            sum += arr[right];

            if (sum > k) {
                sum -= arr[left];
                left++;
            }

            count = count + (right - left + 1);
            right++;
        }

        return count;

    }
}
