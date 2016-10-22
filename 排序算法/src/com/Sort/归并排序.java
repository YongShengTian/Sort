package com.Sort;

import javax.swing.text.AbstractDocument.LeafElement;

public class 归并排序 {
	//// 时间复杂度O(nlogN),适用于基本无序，但是局部有序的情况,空间复杂度O(n)
      public static void main(String[] args) {
    	  int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	  mergesort(a,0,a.length-1);
         for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		}
	}
    
	private static void mergesort(int[] a,int begin,int end) {
		// TODO 自动生成的方法存根
		if (begin<end) {
			int middle=(begin+end)/2;
			mergesort(a, begin, middle);
			mergesort(a, middle+1, end);
			merge(a, begin, middle, end);
		}
		
	}

	private static void merge(int[] a, int begin,int middle,int end) {
		// TODO 自动生成的方法存根
		int[] temparr=new int[a.length];
		for (int i = 0; i < temparr.length; i++) {
			 temparr[i]=a[i];
		}
		int helpleft=begin;
		int helpright=middle+1;
		int currentindex=begin;
		while (helpleft<=middle&&helpright<=end) {
			 if (temparr[helpleft]<=temparr[helpright]) {
				a[currentindex]=temparr[helpleft];
				helpleft++;
			} else {
				a[currentindex]=temparr[helpright];
				helpright++;
			}
			 currentindex++;
		}
		int remain=middle-helpleft;
		for (int i = 0; i <=remain; i++) {
			 a[currentindex+i]=temparr[helpleft+i];
		}
	}
      
}
