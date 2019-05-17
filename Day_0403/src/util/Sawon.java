// 인터페이스. 뼈대. 추상클래스와 유사. 추상화가 더 심함
// 상수, 추상메소드 두가지만 들어감

package util;

public interface Sawon {

	// int x;  //이런거 안됨 
	// public void aaa(){}	 //이런것 역시 안됨
	
	
	
	
	int MAX = 100; // public final int MAX = 100; 이렇게 쓰는것과 똑같음. 생략가능
	void abc(); //public abstract void abc();	// abstract 는 쓸필요가 없음. 생략가능
	
	int add(int x, int y);
	void sum(int ... arr);
}

// 인터페이스를 "구현"한다. 추상클래스는 "상속"한다. 

interface Mem extends Sawon{	 // 인터페이스도 상속은 가능. 
	
}