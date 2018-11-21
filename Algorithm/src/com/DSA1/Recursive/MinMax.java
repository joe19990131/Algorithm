package com.DSA1.Recursive;

public class MinMax {

	public int max(int[] array, int size) {
		if (size == 1)
			return array[0];
		if (max(array, size - 1) < array[size - 1])//array[size-1]>>>最後一個
			//往裡面跑到最後會到array[1]
			//他是個層狀結構
			//下一層的[size-1]其實是[size-1-1]以此類推
			//if(size == 6)
			//max(max(max(max(max(array,1)<1)<2)<3)<4)<array[5]
			//如果到最後沒人比array[size-1]大則回傳array[size-1]
			return array[size - 1];
		else
			return max(array, size - 1);
			
	}
	public int min(int[] array, int size) {
		if (size == 1)
			return array[0];
		if (min(array, size - 1) > array[size - 1])
			return array[size - 1];
		else
			return min(array, size - 1);
	}
	public int nrMax(int[] array,int size) {
		int tmp = array[0];
		for(int i = 1;i<array.length;i++) {
			if(array[i]>tmp)
				tmp = array[i];
		}return tmp;
	}
	public int nrMin(int[] array,int size) {
		int tmp = array[0];
		for(int i = 1;i<array.length;i++) {
			if(array[i]<tmp)
				tmp = array[i];
		}return tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 585, 4, 565,654,12};
		MinMax mm = new MinMax();
		System.out.println(mm.max(num, num.length) +"  "+ mm.min(num, num.length));
		System.out.println(mm.nrMax(num, num.length)+"  "+mm.nrMin(num, num.length));
	}

}
