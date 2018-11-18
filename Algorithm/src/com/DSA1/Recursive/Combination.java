package com.DSA1.Recursive;

import com.DSA1.Recursive.*;

public class Combination {
	public int combination(int n, int m) {
		if(m == 0||n==m)
			return 1;
		else if(m>0&&m<n)
			return (combination(n-1, m)+combination(n-1, m-1));
		
		else
			return 000;
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination combi = new Combination();
		System.out.println(combi.combination(5, 3));
	}

}
