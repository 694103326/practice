/**
 *  给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。

     请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

     你可以假设 nums1 和 nums2 不同时为空。
 */
public class Median_Number {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] num1 = {1,2};
        int[] num2 = {-1,3};
        s.findMedianSortedArrays(num1,num2);
        System.out.println(s.findMedianSortedArrays(num1,num2));
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null){
            return 0.0;
        }
        double median = 0.0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] num = new int[length1+length2];
        for(int i=0;i<length1;i++){
            num[i] = nums1[i];
        }
        for(int i=0;i<length2;i++){
            num[length1+i] = nums2[i];
        }
        //冒泡排序
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        //判断是否为奇数
        if((length1+length2)%2==0){//偶数
            int index = (int)((length1+length2)/2);
            System.out.println(num[index]);
            System.out.println(num[index-1]);
            median = (num[index]+num[index-1])/2.0;
        }else{//奇数
            int index = (int)((length1+length2)/2);
            System.out.println(num[index]);
            median = num[index];
        }
        return median;
    }
}