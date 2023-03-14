public class Solution {
    public double getAverage(int num1, int num2) {
        return (double)(num1 + num2) / 2.0;
    }

    public double getAverage(int num1, int num2, int num3) {
        return (double)(num1 + num2 + num3) / 3.0;
    }

    public int solution(int[] nums) {
        double minAverage = getAverage(nums[0], nums[1]);
        int minAverageIndex = 0;
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            double currentAverage = getAverage(nums[i], nums[i+1]);

            if (currentAverage < minAverage) {
                minAverage = currentAverage;
                minAverageIndex = i;
            }

            if (i < n-2) {
                currentAverage = getAverage(nums[i], nums[i+1], nums[i+2]);

                if (currentAverage < minAverage) {
                    minAverage = currentAverage;
                    minAverageIndex = i;
                }
            }
        }

        return minAverageIndex;
    }
}
