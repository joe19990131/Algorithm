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
		System.out.println("�}�Ca");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println("�}�Cb");
		
		for (i = 0; i < b.length; i++) {
			for (j = 0; j < a[0].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println("�ۭ�");

		for (i = 0; i < a.length; i++) {					//a row(a�}�C�Ĥ@��)
			for (j = 0; j < b[0].length; j++) {				//b column(b�}�C�Ĥ@�C)
				int tmp = 0;
				for (k = 0; k < a.length; k++) {			//a row(�Ha�}�C���欰�D)
					tmp = tmp + a[i][k] * b[k][j];			//�p��c[0][0]�����G�üȦs
				}
				c[i][j] = tmp;								//�x�s�i�}�Cc

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
