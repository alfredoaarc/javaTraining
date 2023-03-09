class Solution {
    public int solution(int[] arr) {
        boolean[] found = new boolean[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!checkIfValid(num, found)) {
                return 0;
            }
        }
        return 1;
    }

    public boolean checkIfValid(int num, boolean[] found) {
        if (num < 1 || num > found.length - 1) {
            return false;
        }
        if (found[num]) {
            return false;
        }
        found[num] = true;
        return true;
    }
}
