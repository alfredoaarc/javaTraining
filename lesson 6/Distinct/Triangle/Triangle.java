import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);  
        
        for (int i = 0; i < A.length - 2; i++) {
            int side1 = A[i];
            int side2 = A[i+1];
            int side3 = A[i+2];
            
            if (isTriangle(side1, side2, side3)) {
                return 1;
            }
        }
        
        return 0;
    }
    
    private boolean isTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3);
    }
}
