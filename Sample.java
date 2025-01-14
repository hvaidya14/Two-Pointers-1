// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


//SPACE COMPLEXITY:O(1)
//TIME COMPLEXITY:O(N)


class Solution {
    public void sortColors(int[] nums) {
        
        if(nums.length == 1) {
            return;
        }
        int pleft =0;
        int curr = 0;
        int pright=nums.length-1;

        while (curr<=pright) {
            if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr]=nums[pleft];
                nums[pleft] = temp;
                pleft++;
                curr++;
            } else if(nums[curr] == 2) {
                int temp = nums[pright];
                nums[pright] = nums[curr];
                nums[curr] = temp;
                pright--;
            } else {
                curr++;
            }
        }
    }

}
