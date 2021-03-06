package solution;

public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int length = 0;
        int index = 1;
        int maximumLength = 1;
        long lastDifference = 0;
        while (index < arr.length) {
            int newDifference = arr[index] - arr[index - 1];
            if (newDifference * lastDifference > 0) {
                length = index - 1;
            } else if (arr[index] == arr[index - 1]) {
                length = index;
            }
            maximumLength = Math.max(maximumLength, index - length + 1);
            lastDifference = newDifference;
            index++;
        }
        return maximumLength;
    }
}
