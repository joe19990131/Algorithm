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
		int i, j, k, tmp;
		for (i = 0; i < data.length - 1; i++) {
			for (j = i + 1; j < data.length; j++) {
				if(data[i]>data[j]) {
					tmp = data[i];
					data[i] = data[j];
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
