package Test;

class Thing {
	int data;

	public Thing(int data) {
		this.data = data;
	}

	public Thing() {
	}

}

public class Test1 {

	public static void main(String args[]) {
		Thing a = new Thing(1);
		Thing b = new Thing(1);
		if (a == b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	int i = 1;
		for(int j = 1;j<=10;++j) {
		i++;
		System.out.println(i);	
		}
		
		
		
	}
}
