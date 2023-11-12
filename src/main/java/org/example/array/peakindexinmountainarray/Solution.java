package org.example.array.peakindexinmountainarray;

public class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid != n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else if (mid != 0 && arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
