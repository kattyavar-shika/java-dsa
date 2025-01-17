package arrays;

/**
 * Rotate an Array by a Given Number of Positions
 * <p>
 * Given an array arr[] of size n and a number k, you need to rotate the array to the right by k positions.
 * This means each element of the array is shifted to the right by k positions,
 * and the last elements wrap around to the front of the array.
 * <p>
 * input:
 * int[] arr = {1, 2, 3, 4, 5};
 * int k = 2;
 * <p>
 * output :
 * [4, 5, 1, 2, 3]
 */
public class RotateAnArrayByGivenNumber {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int k = 2;

    rotateRight(arr, k);

    Helper.printArray(arr);

  }

  /**
   *
   * You are given an array of integers and an integer d. You need to perform a right rotation on the array by d positions. In a right rotation, each element of the array is shifted to the right by one position, and the last element moves to the first position.
   *
   * You need to return the array after performing d right rotations.
   *
   * input:
   * arr = [1, 2, 3, 4, 5]
   * k = 2
   *
   * output:
   *
   *[4, 5, 1, 2, 3]
   */

  public static void rotateRight(int[] arr, int k) {
    int len = arr.length;

    k = k % len;

    //First reverse complete array
    reversArray(arr, 0, len -1);
    reversArray(arr, 0, k -1);
    reversArray(arr, k, len -1);

  }

  /**
   *
   * You are given an array of integers and an integer d.
   * You need to perform a left rotation on the array by d positions.
   * In a left rotation, each element of the array is shifted to the left by one position,
   * and the first element moves to the last position.
   *
   * You need to return the array after performing k left rotations.
   *
   * input:
   * arr = [1, 2, 3, 4, 5]
   * k = 2
   *
   * output:
   * [3, 4, 5, 1, 2]
   */

  public static void rotateLeft(int [] arr, int k){
    int len = arr.length;

    k = k % len;

    //In case of left rotation we have do following step.
    //1 . reverse only first k element
    reversArray(arr, 0, k -1);
    //2. reverse the remaining one.

    reversArray(arr, k, len -1);

    //Finally reverse complete array
    reversArray(arr, 0, len -1);


  }

  public static void reversArray(int[] arr, int start, int end) {
    while (start < end) {

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  /**
   *  // Normalize k (in case k is larger than the array size)
   *     k = k % len;
   *
   *     // Step 1: Reverse the entire array
   *     reversArray(arr, 0, len - 1);
   *     // Step 2: Reverse the first k elements
   *     reversArray(arr, 0, k - 1);
   *     // Step 3: Reverse the remaining n-k elements
   *     reversArray(arr, k, len - 1);
   */
}
