class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String dna = "CAGCCTA";
        int[] start = {2, 5, 0};
        int[] end = {4, 5, 6};
        int[] res = sol.dnaImpact(dna, start, end);
        System.out.println(res); // Output: [2, 4, 1]
    }

    public int[] dnaImpact(String dna, int[] start, int[] end) {
        int dnaLen = dna.length();
        int numQueries = start.length;

        int[][] counts = preprocessDna(dna, dnaLen);

        int[] results = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            int s = start[i];
            int e = end[i];
            int impact = getDnaImpact(counts, s, e);
            results[i] = impact;
        }

        return results;
    }

    private int[][] preprocessDna(String dna, int dnaLen) {
        int[][] counts = new int[4][dnaLen + 1];

        for (int i = 0; i < dnaLen; i++) {
            char nucleotide = dna.charAt(i);
            int nucleotideIndex = getNucleotideIndex(nucleotide);
            counts[nucleotideIndex][i + 1]++;
            for (int j = 0; j < 4; j++) {
                if (j != nucleotideIndex) {
                    counts[j][i + 1] = counts[j][i];
                }
            }
        }

        return counts;
    }

    private int getDnaImpact(int[][] counts, int s, int e) {
        for (int i = 0; i < 4; i++) {
            int startImpact = counts[i][s];
            int endImpact = counts[i][e + 1];
            if (endImpact - startImpact > 0) {
                return i + 1;
            }
        }
        return 0;
    }

    private int getNucleotideIndex(char nucleotide) {
        switch (nucleotide) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                return -1;
        }
    }
}
