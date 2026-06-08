package Arrays;

import java.util.ArrayList;

public class UnionArrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 , 7};
        int[] nums2 = { 1, 2, 7 };

        int[] union = unionArray(nums1, nums2);
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

public static int[] unionArray(int[] A, int[] B) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i< A.length && j < B.length){
            if(A[i] <= B[j]){
                if(list.size() == 0 || list.get(list.size() - 1) != A[i]){
                list.add(A[i]);
                }
                i++;
            }else if(B[j] < A[i]){
                if(list.size() == 0 || list.get(list.size() - 1) != B[j]){
                list.add(B[j]);
                }
                j++;
            }
        }

        while(i< A.length){
            if(list.size() == 0 || list.get(list.size() - 1) != A[i]){
                list.add(A[i]);
            }
            i++;
        }
        while(j< B.length){
            if(list.size() == 0 || list.get(list.size() - 1) != B[j]){
                list.add(B[j]);
            }
            j++;
        }

        int[] result = new int[list.size()];
        for(int k=0 ; k < list.size(); k++){
            result[k]= list.get(k);
        }
        
        return result;
  
    }
}
