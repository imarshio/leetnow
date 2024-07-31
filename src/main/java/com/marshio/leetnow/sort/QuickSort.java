package com.marshio.leetnow.sort;

import java.util.Arrays;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/22 17:13
 */
public class QuickSort {

    public static void main(String[] args) {
        //
        System.out.println(Arrays.toString(new QuickSort().sortArray(new int[]{110, 100, 0})));
        System.out.println(Arrays.toString(new QuickSort().sortArray(new int[]{5, 7, 4, 3, 6, 2})));
    }

    public int[] sortArray(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = doublePointSwap(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);
    }

    public int doublePointSwap(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[start] = arr[right];
        arr[right] = pivot;
        return right;
    }
}
