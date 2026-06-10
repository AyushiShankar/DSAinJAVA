package Arrays;

public class mergeTwosortedArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // int[] result = new int[n+m];
        // for(int i= 0 ; i < m ; i++){
        // result[i] = nums1[i];
        // };
        // for(int i= m ; i < m+n ; i++){
        // result[i] = nums2[i-m];
        // };

        // Arrays.sort(result);

        // for (int i = 0; i < m + n; i++) {
        // nums1[i] = result[i];
        // }

        int mlast = m - 1;
        int nlast = n - 1;
        int flast = m + n - 1;

        while (mlast >= 0 && nlast >= 0) {

            if (nums1[mlast] > nums2[nlast]) {
                nums1[flast] = nums1[mlast];
                mlast--;
            } else {
                nums1[flast] = nums2[nlast];
                nlast--;
            }
            flast--;
        }
        while (nlast >= 0) {
            nums1[flast] = nums2[nlast];
            nlast--;
            flast--;
        }

    }

}
