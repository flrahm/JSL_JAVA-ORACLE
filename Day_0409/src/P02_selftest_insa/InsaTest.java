package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;

public class InsaTest {

	public static void main(String[] args) {
		
		List<Insa> insaList = new ArrayList<Insa>();	// ��� ����Ʈ ����
		
		insaList.add(new Insa("�λ�",1101,"aaa",598327));		// ���� ���ϰ� Ű���� Ÿ���� ��ſ� �̸� �ĳ��� 
		insaList.add(new Insa("�λ�",1102,"bbb",123123));
		insaList.add(new Insa("�λ�",1103,"ccc",42523));
		insaList.add(new Insa("����",1202,"ddd",591239142));
		insaList.add(new Insa("����",1203,"eee",2341897));
		insaList.add(new Insa("������",1301,"fff",1100273));
		insaList.add(new Insa("������",1302,"ggg",123124));

		InsaData insaData = new InsaData(insaList);	// �λ絥���� ��ü�� �����ؼ� ��� ����Ʈ�� ����
		
		insaData.printTitle();	// ���� ���
		insaData.printBody();	// ���� ���
	}

}
