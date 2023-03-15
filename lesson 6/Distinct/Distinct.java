import java.util.HashSet;

public class Solution {
    public int countDistinctValues(int[] numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        return uniqueNumbers.size();
    }
}
