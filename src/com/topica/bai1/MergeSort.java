package com.topica.bai1;

public class MergeSort {

	public void merge(int A[], int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] L = new int[n1];
		int[] R = new int[n2];

		for (i = 0; i < n1; i++) {
			L[i] = A[l + i];
		}
		for (j = 0; j < n2; j++) {
			R[j] = A[m + 1 + j];
		}
		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			A[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			A[k] = R[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2; 
			mergeSort(arr, l, m); 
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r); 
		}
	}

	public int[] mergeSort(int A[]) {
		mergeSort(A, 0, A.length - 1);
		return A;
	}

	public void result(int[] A) {
		int N = A.length;
		System.out.println("Sort result:");
		for (int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] array = {1, 23, 4, 5, 100, 54};
		long startTime = System.currentTimeMillis();
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(array);
		mergeSort.result(array);
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
