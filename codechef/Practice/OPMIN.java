// Problem: OPMIN
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/OPMIN
// Solved on: 2026-10-31T18:48:56.100Z

class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        if(nums.length==0 || nums.length==1)
        return 0;
        int min = nums[0];
        int count = 0 ;
        for(int i : nums){
            if(min>i)
            min=i;
        }
        for(int i : nums){
        if(i== min)
        count++;
        }
        return nums.length-count;
    }
}
