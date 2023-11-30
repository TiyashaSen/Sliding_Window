package Problems;

public class AverageSubarray {
	public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        // Calculate the sum of the first k elements
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
            // Initialize res (result) with the sum of the first k elements
            double res=sum;

            // Iterate from index k to the end of the array
        for(int i=k;i<nums.length;i++){
        // Add the current element and subtract the element k positions back
        sum+=nums[i]-nums[i-k];
        // Update the maximum sum (res) if the current sum is larger
        res=Math.max(res,sum);
        }

        return res/k;
    }
}
