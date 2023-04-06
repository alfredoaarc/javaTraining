import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        int[] peaks = new int[length];
        int numPeaks = 0;

        int peakIndex = 1;
        while (peakIndex < length - 1) {
            if (A[peakIndex] > A[peakIndex - 1] && A[peakIndex] > A[peakIndex + 1]) {
                peaks[numPeaks] = peakIndex;
                numPeaks++;
                peakIndex += 2;
            } else {
                peakIndex++;
            }
        }

        if (numPeaks < 2) {
            return numPeaks; 
        }

        int maxFlags = 1; 

        
        int dist = 1;
        while (dist <= numPeaks - 1) {
            int numFlags = 1; 
            int lastPeak = peaks[0];

            int index = 1;
            while (index < numPeaks && numFlags < dist + 1) {
                int currentPeak = peaks[index];
                if (currentPeak - lastPeak >= dist) {
                    numFlags++;
                    lastPeak = currentPeak;
                }
                index++;
            }

            if (numFlags == dist + 1) {
                maxFlags = numFlags;
                dist++;
            } else {
                break;
            }
        }

        return maxFlags;
    }
}
