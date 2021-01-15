// You are given an integer n. An array nums of length n + 1 is generated in the following way:
// nums[0] = 0
// nums[1] = 1
// nums[2 * i] = nums[i] when 2 <= 2 * i <= n
// nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
// Return the maximum integer in the array nums.

// Example 1:

// Input: n = 7
// Output: 3

//Solution
class Solution {
    
    //User Input
    public int getMaximumGenerated(int n) {
        
        // For the case: nums[0]=0
        if(n<2) return n; 
        
        //Creating an array nums[]
        int[] nums = new int[n+1];
        
        //For the case: nums[1]=1
        nums[1]=1;
        
        // Taking the maximum value=0
        int max=0;
        for(int i=2; i<=n;i++)
        {
            //For the other cases: Dividing by 2
            if(i%2==0) nums[i]= nums[i/2]; 
                else nums[i]= nums[i/2]+ nums[i/2 + 1];
                max= Math.max(max, nums[i]);
        }
        return max;
    }
}
