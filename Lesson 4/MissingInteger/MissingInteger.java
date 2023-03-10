class SmallestPositiveInteger {

    private int SmallestPositiveInteger(int[] numbers) {
        int n = numbers.length;
        boolean[] present = new boolean[n+1];

        for (int i=0; i<n; i++) {
            if (numbers[i] > 0 && numbers[i] <= n) {
                present[numbers[i]] = true;
            }
        }

        for (int i=1; i<=n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n+1;
    }
}
