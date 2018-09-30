package com.DSA1.FirstHomeWork;

public class SelectionSort {

	int data[] = { 55, 68, 25, 29, 35, 36 };

	public void showData() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println("");
	}

	public void sort() {
		int i, j, tmp;
		for (i = 0; i < data.length - 1; i++) {				//n個數執行n-1次
			for (j = i + 1; j < data.length; j++) {			//從第i+1個數開始比較，有則換，無則跳過
				if(data[i]>data[j]) {
					tmp = data[i];
					data[i] = data[j];						//交換
					data[j] = tmp;
				}
			}

		}
	}
	public static void main(String[]rags) {
		SelectionSort ss = new SelectionSort();
		ss.showData();
		ss.sort();
		ss.showData();
	}
}
