package Problems;

import java.util.Arrays;

public class HighestAndLowestKScores {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }

        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length-k+1;i++){

            
           int diff=Math.abs(nums[i]-nums[i+k-1]);
           ans=Math.min(ans,diff);

        }

     return ans;

     }
}
