package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 2, 3, 4, 5};

    System.out.println("Original array ");
    printArray(arr);
    reverseArrayInPlace(arr);
    System.out.println("After reverse ");
    printArray(arr);

    //Using another options
    System.out.println("Using list revers functions");
    System.out.println("Original array ");
    printArray(arr2);
    reverseArrayInPlace(arr2);
    System.out.println("After reverse ");
    printArray(arr2);



  }

  public static void reverseArrayInPlace(int[] arr) {
    if (arr == null) {
      return;
    }
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int temp = arr[right];
      arr[right] = arr[left];
      arr[left] = temp;
      left++;
      right--;
    }
  }

  public static void reverseArrayUsingCollections(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      list.add(i);
    }

    list = list.reversed();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }

  }

  //Helper method to print the array

  static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

}
