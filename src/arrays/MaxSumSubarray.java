package arrays;

/**
 * Problem :
 * Given an integer array arr of size n,
 * your task is to find the sum of the contiguous subarray (containing at least one number) which has the largest sum
 * <p>
 * Example:
 * int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
 * <p>
 * output :
 * Maximum Subarray Sum: 6
 */

// Solution :

/**
 * To find the maximum sum subarray in a given array, we can use Kadane's Algorithm. This algorithm is efficient and works in linear time, O(n). It finds the maximum sum subarray by iterating through the array once and updating the maximum sum dynamically as it processes each element.
 * <p>
 * Kadane’s Algorithm Explanation:
 * Initialization:
 * <p>
 * Maintain two variables: max_so_far (the maximum sum encountered so far) and max_ending_here (the maximum sum that ends at the current position).
 * Iterate through the array:
 * <p>
 * For each element, decide whether to:
 * Add the current element to the existing sum (max_ending_here + arr[i]).
 * Start a new subarray with the current element alone (arr[i]).
 * Update max_ending_here with the maximum of these two choices.
 * Update max_so_far if max_ending_here is larger than max_so_far.
 * Result:
 * <p>
 * After processing the entire array, max_so_far will hold the maximum sum of the subarray.
 */
public class MaxSumSubarray {

  public static void main(String[] args) {

    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println("Orignal Array ");
    printArray(arr);
    System.out.println("Max sum = " + maxSubArraySum(arr));
    System.out.println();
    maxSubArrayElementInSum(arr);

  }

  public static int maxSubArraySum(int[] arr) {

    int maxSoFar = arr[0];
    int maxEndingHere = arr[0];

    for (int i = 1; i < arr.length; i++) {
      maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
      maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;
  }

  /**
   * In case if you would like to know subArray.
   * Given an integer array arr of size n, your task is to find the contiguous subarray (containing at least one number)
   * which has the largest sum. In addition to the sum,
   * you need to return the subarray that contributes to this sum.
   */
  public static void maxSubArrayElementInSum(int[] arr) {

    int maxSoFar = arr[0];
    int maxEndingHear = arr[0];

    int start = 0;
    int end = 0;
    int tempStart = 0;


    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxEndingHear + arr[i]) {
        tempStart = i;
        maxEndingHear = arr[i];
      } else {
        maxEndingHear = maxEndingHear + arr[i];
      }

      if (maxEndingHear > maxSoFar) {
        maxSoFar = maxEndingHear;
        start = tempStart;
        end = i;
      }
    }

    // Now lets print the array which include in sum.
    System.out.println("Array include in sum = " + maxSoFar);
    for (int i = start; i <= end; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();


  }

  static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
