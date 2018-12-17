package com.DSA1.Soft;

public class SelectSoft {
    int[] data = new int[] {5,3,9,8,5,4,6,7};

    private void show(){
        for(int i = 0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }System.out.println("\t");
    }
    private void soft(){
        int tmp = 0;
        for(int i = 0;i<data.length-1;i++){
            for (int j = i+1;j<data.length;j++){
                if(data[i]>data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SelectSoft selectSoft = new SelectSoft();
        selectSoft.show();;
        selectSoft.soft();
        selectSoft.show();
    }
}
