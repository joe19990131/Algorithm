package com.DSA1.FirstHomeWork;

import java.util.Scanner;

public class NlevelOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		int j = 1;
		for (int i = 1; i <= num; i++) {
			j = j * i;

		}
		System.out.println(num + "!=" + j);
	}

}
