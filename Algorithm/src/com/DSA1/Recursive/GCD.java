package com.DSA1.Recursive;
public class GCD {
	
	public int gcd(int a,int b) {
		if(b == 0) 
			return a;
		else
		return gcd(b,a%b); 
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD gcd = new GCD();
		System.out.println(gcd.gcd(5, 16));
	}

}
