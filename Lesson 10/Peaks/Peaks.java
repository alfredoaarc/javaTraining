import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < N - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        int maxBlocks = 0;
        int elements = 1;

        while (elements * elements <= N) {
            if (N % elements == 0) {
                int blocks = N / elements;

                int findCnt = 0;
                int blockStartIdx = 0;
                int blockEndIdx = elements;

                for (int peak : peaks) {
                    if (peak >= blockStartIdx && peak < blockEndIdx) {
                        findCnt++;
                        blockStartIdx = blockEndIdx;
                        blockEndIdx += elements;
                    }
                }

                if (findCnt == blocks) {
                    maxBlocks = blocks;
                }
            }

            elements++;
        }

        return maxBlocks;
    }
}
