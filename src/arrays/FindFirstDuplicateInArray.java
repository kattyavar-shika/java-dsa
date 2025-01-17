package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Statement:
 * Problem: Find the First Duplicate in an Array
 * <p>
 * Given an integer array arr of size n, your task is to find the first element that appears more than once in the array.
 * You need to return the first duplicate element in the array.
 * If no such element exists, return -1.
 * <p>
 * int[] arr = {1, 2, 3, 4, 5, 2, 6};
 * <p>
 * Ans:
 * 2
 */
public class FindFirstDuplicateInArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 2, 6};
    //int arr[] = {100, 200, 300, 400, 500, 200, 6};
    System.out.println("First duplicate using Set " + findFirstDuplicateUsingHashSet(arr));
    System.out.println("First duplicate using inPlace " + findFirstDuplicateUsingInPlace(arr));
  }

  //Using hashSet approach;
  public static int findFirstDuplicateUsingHashSet(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (seen.contains(arr[i])) {
        return arr[i];
      } else {
        seen.add(arr[i]);
      }
    }
    return -1;
  }

  /**
   * there is an alternate way to find the first duplicate in an array without using extra space like a HashSet.
   * You can solve the problem in O(n) time complexity and O(1) extra space complexity by modifying the array itself during the process.
   * Alternate Approach: Modify Array In-Place
   * The idea is to take advantage of the fact that the values in the array can be used as indices.
   * The key observation is that if a number appears again in the array, we can identify it by checking the sign of the number at the index corresponding to that value.
   *
   * Important Assumption:
   *
   * The array elements must be within the range 1 <= arr[i] <= n where n is the size of the array (or similar constraints).
   * This technique relies on the fact that the elements' absolute values can be treated as indices in the array, and we can safely flip their signs to track occurrences.
   */

  public static int findFirstDuplicateUsingInPlace(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int index = Math.abs(arr[i]) - 1;

      if (arr[index] < 0){
        return arr[i];
      }

      arr[index] = -arr[index];

    }
    return -1;
  }

}
