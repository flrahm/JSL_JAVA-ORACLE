// contains Ŭ�������� �������� equals overriding

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
		
		if(obj instanceof TestClass) {	// instanceof ������ ��ü���� �˻��ϴ� ������
			TestClass t = (TestClass)obj;
			return t.id.equals(this.id);
		}
		else
			return false;
		
	}
	
}
