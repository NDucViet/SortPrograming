package SortNSearch.controller;

public class Argorithm {
    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public int partition(int[] array, int left, int right) {
        // exam: 1 12 5 [7] 6 9 2 : 7 is pivot
        // Run from left: i - Run from right: j
        int i = left, j = right;
        // Instance a variable: pivot - trục
        int pivot = array[(left + right) / 2];
        // Create a temp variable
        int tmp;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // Execute swap between value of index [i] and value of index [j]
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        ;
        return i;
    }

    public void quickSort(int[] array, int left, int right) {
        // Search index of array - vách ngăn
        int index = partition(array, left, right);
        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    public String linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return "" + i;
            }
        }
        return n + " not found in array";

    }

    public String binarySerach(int[] arr, int value, int left, int right) {
        if (left > right) {
            return value+" not found";
        }
        int mid = (left + right) / 2;
        if (arr[mid] == value) {
            return "your number at index " + mid;
        } else if (arr[mid] > value) {
            return binarySerach(arr, value, left, mid -1);
        } else{
            return binarySerach(arr, value, mid +1, right);
        }
    }
}
