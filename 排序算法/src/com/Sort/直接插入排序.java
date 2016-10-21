package com.Sort;

public class 直接插入排序 {
	// //时间复杂度O(n^2),空间复杂度O(1)
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		zhijiesort(a);
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}

	}

	private static void zhijiesort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int currentvalue = a[i];
			int j;
			for (j = i - 1; j >= 0 && a[j] > currentvalue; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = currentvalue;
		}
	}
}
