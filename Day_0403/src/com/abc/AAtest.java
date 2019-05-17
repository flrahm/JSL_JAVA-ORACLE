package com.abc;

class BBB{
	int x = 10;
	int y = 20;
	
	@Override
	public String toString() {
		return x + "\t" + y;
	}
}

public class AAtest {

	public static void main(String[] args) {
		BBB b = new BBB();
		
		System.out.println(b);
	}

}
