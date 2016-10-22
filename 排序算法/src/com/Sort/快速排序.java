package com.Sort;

public class 快速排序 {
	////时间复杂度O(nlogN)，无序简单除暴，有序时选择，冒泡O（n）
     public static void main(String[] args) {
    	 int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
    	 quicksort(a,0,a.length-1);
    	 for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
	}
     public static void  quicksort(int[]a,int begin,int end) {
         if (begin>end) {
			return ;
		}
        int temp=a[begin];
        int i=begin,j= end;
        while (i!=j) {
			 while (i<j&&a[j]>=temp) {
			      j--;
			}
			 while (i<j&&a[i]<=temp) {
			      i++;
			}
			 if (i<j) {
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
			}
		}
        a[begin]=a[i];
        a[i]=temp;
        quicksort(a,begin,i-1);
        quicksort(a,i+1,end);
	}
     
     
}
