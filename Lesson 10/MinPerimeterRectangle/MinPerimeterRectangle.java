public class Solution {
    public int getMinPerimeterForArea(int area) {
        int minimumPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= area; i++) {
            if (area % i == 0) {
                int factor1 = i;
                int factor2 = area / i;
                minimumPerimeter = Math.min(minimumPerimeter, 2 * (factor1 + factor2));
            }
        }
        return minimumPerimeter;
    }
}
