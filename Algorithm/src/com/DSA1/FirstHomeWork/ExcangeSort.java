package com.DSA1.FirstHomeWork;

public class ExcangeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp = 0;
		int n[] = {51,23,6,65,15};
		for(int i = 0;i<n.length-1;i++)
		{for(int j = i+1;j<n.length;j++)
			{if(n[i]>n[j])
				{tmp = n[i];
				n[i] = n[j];
				n[j] = tmp;}
			}
			
		}
		for(int k=0;k<n.length;k++)
		{System.out.print(n[k] + " ");}
	}

}
