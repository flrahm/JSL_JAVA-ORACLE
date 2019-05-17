// contains 클래스에서 쓰기위한 equals overriding

package p01_ListExam.test;

public class TestClass {

	String id;
	String name;
	public TestClass(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return id + "\t" + name;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof TestClass) {	// instanceof 동일한 객체인지 검사하는 연산자
			TestClass t = (TestClass)obj;
			return t.id.equals(this.id);
		}
		else
			return false;
		
	}
	
}
