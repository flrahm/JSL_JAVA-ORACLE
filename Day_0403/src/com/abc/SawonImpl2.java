package com.abc;

import util.Sawon;

//다중 상속을 인터페이스를 통해서 구현
public class SawonImpl2 extends AA implements Sawon { // , Sawon2 , Sawon3 .... 인터페이스는 여러개 상속 가능

	@Override
	public void abc() {
		// TODO Auto-generated method stub

	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sum(int... arr) {
		// TODO Auto-generated method stub

	}
}
