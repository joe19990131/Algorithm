package com.DSA1.FirstHomeWork;

import java.util.Scanner;

public class BinarySearch {
	int data[] = { 1, 2, 3, 5, 6, 4, 8, 9, 7, 4 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		bs.show();
		bs.search();
	}

	public void show() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+"  ");
		}
	}

	public void search() {
		int num = 0;
		int end = data.length-1;
		int start = 0;
		Scanner sc1 = new Scanner(System.in);
		int key = sc1.nextInt();
		int mid = (start + end) / 2;

		while (num != -1) {
			mid = (start + end) / 2;
			if (key == mid) {
				System.out.println("found  in  " + mid);

				break;
			}
			if (key < data[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (start > end) {
				System.out.println("not found");
				num = -1;
				break;

			}
		}
	}
}
