package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;

public class InsaTest {

	public static void main(String[] args) {
		
		List<Insa> insaList = new ArrayList<Insa>();	// 어레이 리스트 선언
		
		insaList.add(new Insa("인사",1101,"aaa",598327));		// 보기 편하게 키보드 타이핑 대신에 미리 쳐놨음 
		insaList.add(new Insa("인사",1102,"bbb",123123));
		insaList.add(new Insa("인사",1103,"ccc",42523));
		insaList.add(new Insa("자재",1202,"ddd",591239142));
		insaList.add(new Insa("자재",1203,"eee",2341897));
		insaList.add(new Insa("마케팅",1301,"fff",1100273));
		insaList.add(new Insa("마케팅",1302,"ggg",123124));

		InsaData insaData = new InsaData(insaList);	// 인사데이터 객체를 생성해서 어레이 리스트를 전달
		
		insaData.printTitle();	// 제목 출력
		insaData.printBody();	// 몸통 출력
	}

}
