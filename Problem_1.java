// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int low = 0, high = n - 1, mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int mid, int index){
        int temp = nums[mid];
        nums[mid] = nums[index];
        nums[index] = temp;
    }
}