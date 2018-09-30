package com.DSA1.FirstHomeWork;

import java.util.Scanner;




public class SequentialSearch {
	static int[] nums = new int[10];
	//{0,1,2,3,4,5,6,7,8,9}
	
	
	public static int sequentialsearch(int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return key;
			}
		}
		return -1;

	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 10; i++) {
			nums[i] = i;

		}
		
		
		Scanner sc1 = new Scanner(System.in);
		int search = sc1.nextInt();
		if (search < nums.length) {
			System.out.print(sequentialsearch(search));
		} else {
			System.out.println("Err：over range");
		}

		sc1.close();
	}
}
