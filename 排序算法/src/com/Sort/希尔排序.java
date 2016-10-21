package com.Sort;

public class Ï£¶ûÅÅÐò {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		xiersort(a);
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
	}
	private static void xiersort(int[] a) {
		int d=a.length;
		while (d>1) {
			for (int i = d; i <a.length; i++) {
				int currentvalue=a[i];
				int j;
				for (j = i - d; j >= 0 && a[j] > currentvalue; j-=d) {
					a[j + d] = a[j];
				}
				a[j + d] = currentvalue;
			}
			d=d/2;
		}
	}
}
