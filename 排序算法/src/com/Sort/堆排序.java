package com.Sort;

import java.util.Arrays;

public class 堆排序 {
	///时间复杂度O(nlogN)
    public static void main(String[] args) {
    	int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	heapsort(a); 
    	for (int i = 0; i < a.length; i++) {
			int j = a[i];
			 System.out.println(j);
		}
	}
    public static void swap(int[]data,int i,int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
    public static void buildHeap(int[]data,int lastindex) {
    	///一般用数组来表示堆，若根结点存在序号0处， i结点的父结点下标就为(i-1)/2。
    	//i结点的左右子结点下标分别为2*i+1和2*i+2。
		for (int i = (lastindex-1)/2; i>=0; i--) {  
			int k=i;
			while (2*k+1<=lastindex) {  ///有左儿子
				 int bigindex=2*k+1;
				 if (bigindex<lastindex) {
					if (data[bigindex]<data[bigindex+1]) {
						bigindex++;///右儿子
					}
				}
				 if (data[k]<data[bigindex]) {
					swap(data, k, bigindex);
					k=bigindex;
				}
				 else {
					break;
				}
				
			}
			
		}
	}
    public static void heapsort(int[] a) {
		 for (int i = 0; i < a.length-1; i++) {
			 buildHeap(a,a.length-i-1);
			 swap(a, 0, a.length-i-1);
			
		}
	}
}
