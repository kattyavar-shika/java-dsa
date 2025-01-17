package arrays;

/**
 * Problem: Find the Maximum and Minimum Elements in an Array
 * <p>
 * Given an integer array arr of size n, your task is to find the maximum and minimum elements in the array.
 * <p>
 * input :
 * int[] arr = {1, 2, 3, 4, 5};
 * <p>
 * output :
 * Maximum: 5, Minimum: 1
 */
public class FindMaxMin {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int[] result = findMinMaxInArray(arr);
    System.out.println(" Max: " + result[0] + ", Min: " + result[1]);

  }

  public static int[] findMinMaxInArray(int[] arr) {

    if (arr == null || arr.length == 0) {
      return new int[]{};
    }

    int max = arr[0];
    int min = arr[0];


    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > max) {
        max = arr[i];
      }

      if (arr[i] < min) {
        min = arr[i];
      }

    }
    return new int[]{max, min};
  }
}
