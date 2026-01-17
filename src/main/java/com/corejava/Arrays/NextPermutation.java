// Question:
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
// For example, for arr = [1,2,3], the following are all the permutations of arr:
// [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].

// The next permutation of an array of integers is the next lexicographically greater permutation of its integers.
// More formally, if all the permutations of the array are sorted in lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted order.

// If such arrangement is not possible (i.e., the array is the last permutation), then rearrange it to the lowest possible order (i.e., sorted in ascending order).
// Example: 
// Input: nums = [1,2,3]
// Output: [1,3,2]
// Explanation:
// The next permutation of [1,2,3] is [1,3,2].

package com.corejava.Arrays;

class NextPermutationSolution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            nums = reverse(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i >= index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            nums = reverse(nums, index + 1, nums.length - 1);
        }
    }

    public static int[] reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}

public class NextPermutation {
    public static void main(String[] args) {
        // int[] a = { 1, 2, 3 }; // test case 1
        int[] a = { 3, 2, 1 }; // test case 2
        NextPermutationSolution solution = new NextPermutationSolution();
        solution.nextPermutation(a);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }
}
