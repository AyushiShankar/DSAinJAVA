package Arrays;

import java.util.ArrayList;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 2, 7 };

        ArrayList<Integer> intersection = intersection(nums1, nums2);
        for (int num : intersection) {
            System.out.print(num+" ");
        }
    }

    public static ArrayList<Integer> intersection(int[] A, int[] B) {
ArrayList<Integer> list = new ArrayList<>();
        
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if(A[i]< B[j]){
                i++;
            }
            else if(A[i]> B[j]){
                j++;
            }
            else{
                list.add(A[i]);

                i++;
                j++;
            }   

        }
        return list;
    }

}
