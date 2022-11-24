//After removing at most one element, it will sort in a non-decreasing order
//1 2 3 5 4 = Happy Sorted Array; 5 4 3 2 1 = Not Happy
//Java program to remove minimum elements. Find min number of elements to be removed

public class HappySortedArray2 {

    static int MAX = 1000;

    // dp[i][j] denotes the minimum
    // number of elements left in
    // the subarray arr[i..j].
    static int dp[][] = new int[MAX][MAX];

    static int minSizeRec(int arr[], int low,
                          int high, int k)
    {
        // If already evaluated
        if (dp[low][high] != -1)
        {
            return dp[low][high];
        }

        // If size of array is less than 3
        if ((high - low + 1) < 3)
        {
            return high - low + 1;
        }

        // Initialize result as the
        // case when first element is
        // separated (not removed
        // using given rules)
        int res = 1 + minSizeRec(arr,
                low + 1, high, k);

        // Now consider all cases when
        // first element forms a triplet
        // and removed. Check for all
        // possible triplets (low, i, j)
        for (int i = low + 1; i <= high - 1; i++)
        {
            for (int j = i + 1; j <= high; j++)
            {
                // Check if this triplet
                // follows the given rules of
                // removal. And elements
                // between 'low' and 'i' , and
                // between 'i' and 'j' can
                // be recursively removed.
                if (arr[i] == (arr[low] + k) &&
                        arr[j] == (arr[low] + 2 * k) &&
                        minSizeRec(arr, low + 1, i - 1, k) == 0 &&
                        minSizeRec(arr, i + 1, j - 1, k) == 0)
                {
                    res = Math.min(res, minSizeRec(arr, j + 1, high, k));
                }
            }
        }

        // Insert value in table and return result
        return (dp[low][high] = res);
    }

    // This function mainly initializes
    // dp table and calls recursive
    // function minSizeRec
    static int minSize(int arr[], int n, int k)
    {
        for (int i = 0; i < MAX; i++)
        {
            for (int j = 0; j < MAX; j++)
            {
                dp[i][j] = -1;
            }
        }
        return minSizeRec(arr, 0, n - 1, k);
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 4, 5, 6, 4};
        int n = arr.length;
        int k = 1;
        System.out.println(minSize(arr, n, k));
    }
}
