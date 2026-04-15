class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int leftK = n-k;
        leftRotation(nums,leftK);
    }
    public void leftRotation(int[]arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k-1);
        reverse(arr,k, n-1);
        reverse(arr,0,n-1);
    }
    public void reverse(int[]arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}