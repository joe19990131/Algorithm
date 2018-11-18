package com.DSA1.Recursive;

public class Ackermann {
	public int ackermann(int m, int n) {
		if (m == 0)
			return n + 1;
		else if (n == 0 && m > 0)
			return ackermann(m - 1, 1);
		else
			return ackermann(m - 1, ackermann(m, n - 1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ackermann ackermann = new Ackermann();

		System.out.println(ackermann.ackermann(3, 2));
	}

}
