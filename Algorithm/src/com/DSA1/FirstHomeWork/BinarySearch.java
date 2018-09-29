package com.DSA1.FirstHomeWork;

import java.util.Scanner;

public class BinarySearch {
	int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		bs.show();
		bs.search();
	}

	public void show() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");

		}
		System.out.println("");
	}

	public void search() {
		
		int end = data.length - 1;
		int start = 0;
		Scanner sc1 = new Scanner(System.in);
		int key = sc1.nextInt();
		int mid = (start + end) / 2;

		while (true) {
			mid = (start + end) / 2;
			if (key == data[mid]) {
				System.out.println("found  in place  " + mid);
				break;
			} else if (key > data[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (start > end) {
				System.out.println("not found");
				break;

			}
		}
	}
}
