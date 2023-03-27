class Solution {
    public int solution(int[] A) {
        if (A == null || A.length < 2) {
            return 0; 
        }
        
        int maxProfit = 0;
        int minPrice = A[0]