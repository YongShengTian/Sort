package com.Sort;

public class ��ѡ������ {
	////O��n*n�������ȶ����㷨
    public static void main(String[] args) {
    	int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
    	jiandansort(a);
    	for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
	}
    public static void jiandansort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min=a[i];
			int n=i;
			for (int j = i+1; j < a.length; j++) {
				 if (a[j]<min) {
					min=a[j];
					n=j;
				}
			}
			 a[n]=a[i];
			 a[i]=min;
			 
		}
	}
}
