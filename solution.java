
/* Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000]. */


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.HashSet;
import java.util.HashMap; //esto no haría falta no es un map
class Solution {
    public int solution(int[] A) {

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                s.add(A[i]);
            }
        }
        int smallestInt = 1;
        while (s.contains(smallestInt)) {
            smallestInt++;
        }
        return smallestInt;
    }
}