package com.DSA1.Soft;

public class BubbleSoft {
    public static void main(String[] args) {
        int tmp = 0;
        int n[] = {51,23,6,65,15};
        for(int i = n.length-1;i>0;i--) {
            for(int j = 0;j<i;j++) {
                if(n[j]>n[j+1]) {
                    tmp = n[j+1];
                    n[j+1] = n[j];
                    n[j] = tmp;}
                }
        }
        for(int k=0;k<n.length;k++)
        {System.out.print(n[k] + " ");}
    }
}

