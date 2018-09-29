package com.DSA1.FirstHomeWork;

public class TwoDimensionalMatrix {

	int a[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
	int b[][] = { { 5, 6 }, { 7, 8 } };
	int c[][] = new int[a.length][b[0].length];
	int i;
	int j;
	int k;

	void start() {
		// System.out.println(a[0].length);
		System.out.println("陣列a");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println("陣列b");
		
		for (i = 0; i < b.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println("相乘");

		for (i = 0; i < a.length; i++) {					//a row(a陣列第一行)
			for (j = 0; j < b[0].length; j++) {				//b column(b陣列第一列)
				int tmp = 0;
				for (k = 0; k < a.length; k++) {			//a row(以a陣列的行為主)
					tmp = tmp + a[i][k] * b[k][j];			//計算c[0][0]之結果並暫存
				}
				c[i][j] = tmp;								//儲存進陣列c

			}

		}
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < b[0].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalMatrix tdm = new TwoDimensionalMatrix();
		tdm.start();
	}

}
