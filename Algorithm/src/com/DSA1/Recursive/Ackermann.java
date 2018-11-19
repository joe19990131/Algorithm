package com.DSA1.Recursive;

public class Ackermann {
	//public long nonRecursiveAckermann(long m,long n) {
		//if(m == 0)
			//return n+1;
		//else if()
	//}
	
	public long recursiveAckermann(long m, long n) {
		if (m == 0)
			return n + 1;
		else if (n == 0 && m > 0)
			return recursiveAckermann(m - 1, 1);
		else
			return recursiveAckermann(m - 1, recursiveAckermann(m, n - 1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ackermann ackermann = new Ackermann();

		System.out.println(ackermann.recursiveAckermann(3, 2));
	}

}
