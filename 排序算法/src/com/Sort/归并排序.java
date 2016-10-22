package com.Sort;

public class 归并排序 {
	//// 时间复杂度O(nlogN),适用于基本无序，但是局部有序的情况
      public static void main(String[] args) {
    	  int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	  mergesort(a,0,a.length-1);
         for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		}
	}

	private static void mergesort(int[] a,int begin,int end) {
		// TODO 自动生成的方法存根
		if (begin>end) {
			return;
		}
		int middle=(begin+end)/2;
		mergesort(a, begin, middle);
		mergesort(a, middle, end);
	}
      
}
