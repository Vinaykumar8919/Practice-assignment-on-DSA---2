class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
       
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1+n2;
        int arr[] = new int[n3];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2) {
            if(nums1[i]<=nums2[j])
                arr[k]=nums1[i++];
            else
                arr[k]=nums2[j++];
            k++;
        }
        while(i<n1) {
            arr[k++]=nums1[i++];
        }
        while(j<n2) {
            arr[k++]=nums2[j++];
        }
        
        if(n3%2==0) {
            res = (double)(arr[n3/2]+arr[n3/2-1]) / 2;
        } else {
            res = arr[n3/2];
        }
        return res;
    }
}
