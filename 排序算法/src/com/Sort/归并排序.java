package com.Sort;

import javax.swing.text.AbstractDocument.LeafElement;

public class �鲢���� {
	//// ʱ�临�Ӷ�O(nlogN),�����ڻ������򣬵��Ǿֲ���������,�ռ临�Ӷ�O(n)
      public static void main(String[] args) {
    	  int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	  mergesort(a,0,a.length-1);
         for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		}
	}
    
	private static void mergesort(int[] a,int begin,int end) {
		// TODO �Զ����ɵķ������
		if (begin<end) {
			int middle=(begin+end)/2;
			mergesort(a, begin, middle);
			mergesort(a, middle+1, end);
			merge(a, begin, middle, end);
		}
		
	}

	private static void merge(int[] a, int begin,int middle,int end) {
		// TODO �Զ����ɵķ������
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
