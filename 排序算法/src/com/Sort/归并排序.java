package com.Sort;

public class �鲢���� {
	//// ʱ�临�Ӷ�O(nlogN),�����ڻ������򣬵��Ǿֲ���������
      public static void main(String[] args) {
    	  int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	  mergesort(a,0,a.length-1);
         for (int i = 0; i < a.length; i++) {
			 System.out.println(a[i]);
		}
	}

	private static void mergesort(int[] a,int begin,int end) {
		// TODO �Զ����ɵķ������
		if (begin>end) {
			return;
		}
		int middle=(begin+end)/2;
		mergesort(a, begin, middle);
		mergesort(a, middle, end);
	}
      
}
