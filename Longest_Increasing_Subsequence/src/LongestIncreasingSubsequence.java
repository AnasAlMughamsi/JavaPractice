
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] array = { 1, 8, 7, 12, 2, 10, 14, 9, 5, 14, 11, 7, 17 };
        int length = array.length;
        System.out.println("Length of LIS is: " + LIS(array, length));

    }

    public static int LIS(int arr[], int arrayLength) {
        if(arrayLength == 1)
            return 1;

        int maxNumber = 1;
        int[] max = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    max[i] = Math.max(max[i], max[j] + 1);
                }
            }
            maxNumber = Math.max(max[i], maxNumber);
        }
        return maxNumber + 1;
    }
}
