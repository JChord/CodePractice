package com.doslin.leetcode.array._215;

/**
 * Kth Largest Element in an Array
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public int findKthLargest(int[] nums, int k) {
		quickSort(nums, 0, nums.length - 1);
		return nums[nums.length - k];
	}

	// 对 arr[l...r] 部分进行 partition 操作
	// 返回 p， 使得 arr[l...p-1] < arr[p]， arr[p+1...r] > arr[p]
	private int partition(int[] arr, int l, int r) {
		int v = arr[l];

		// arr[l+1...j] < v, arr[j+1...i) > v
		int j = l;
		for (int i = l + 1; i <= r; i++) {
			if (arr[i] < v) {
				int tmp = arr[i];
				arr[i] = arr[j + 1];
				arr[j + 1] = tmp;
				j++;
			}
		}

		int tmp = arr[l];
		arr[l] = arr[j];
		arr[j] = tmp;
		return j;
	}

	private void quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int p = partition(arr, l, r);
		quickSort(arr, l, p - 1);
		quickSort(arr, p + 1, r);
	}
}
