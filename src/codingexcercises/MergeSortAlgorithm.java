package codingexcercises;

import java.util.Arrays;

public class MergeSortAlgorithm {

    public static void main(String [] args){
        int [] nums = {1, 3, 0, 2 ,9};
        int [] nums2 = {8, 5, 3, 1, 9, 10, 25, 30, 100, 23, 2, 3, 6};

        mergeSort(nums);
        mergeSort(nums2);

        System.out.println("Sorted nums: " + Arrays.toString(nums));
        System.out.println("Sorted nums2: " + Arrays.toString(nums2));
    }

    public static void mergeSort(int [] array) {
        mergeSort(array, 0, array.length - 1, new int[array.length]);
    }

    public static void mergeSort(int [] array, int leftBeginIndex, int rightEndIndex, int [] tempArray){
        if(leftBeginIndex >= rightEndIndex){
            return;
        }
        int middle = (leftBeginIndex + rightEndIndex) / 2;
        mergeSort(array, leftBeginIndex, middle, tempArray);
        mergeSort(array, middle + 1, rightEndIndex, tempArray);
        mergeHalves(array, leftBeginIndex, rightEndIndex, tempArray);
    }

    public static void mergeHalves(int [] array, int leftBegin, int rightEnd, int [] tempArray){
        int leftEnd = (rightEnd + leftBegin) / 2;
        int rightBegin = leftEnd + 1;
        int size = rightEnd -leftBegin + 1;
        int leftIndex = leftBegin;
        int rightIndex = rightBegin;
        int tempIndex = leftBegin;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd){
            if(array[leftIndex] <= array[rightIndex]){
                tempArray[tempIndex] = array[leftIndex];
                leftIndex++;
            }else{
                tempArray[tempIndex] = array[rightIndex];
                rightIndex++;
            }

            tempIndex++;
        }

        System.arraycopy(array, leftIndex, tempArray, tempIndex,leftEnd - leftIndex + 1);
        System.arraycopy(array, rightIndex, tempArray, tempIndex,rightEnd - rightIndex + 1);
        System.arraycopy(tempArray, leftBegin, array, leftBegin, size);
    }
}
