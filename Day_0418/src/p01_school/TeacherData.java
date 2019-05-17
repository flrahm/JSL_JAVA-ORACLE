// ������ ��ϰ� ������ ��ϸ��� ó���ϴ� �޼ҵ尡 ��� Ŭ����

package p01_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherData {

	private List<Teacher> tList = new ArrayList<Teacher>();
	
	public TeacherData(String fileName) {
		tFileRead(fileName);
	}

	
	List<Teacher> upAge(int age){
		List<Teacher> returnList = new ArrayList<Teacher>();
		
		System.out.println("������ " + age + " �̻��� ���� ���");
		for(int i = 0; i < tList.size() ; i++)
			if(tList.get(i).getAge() > age)
				returnList.add(tList.get(i));
		
		return returnList;
	}
	
	// ���� ��ȣ�� ��ġ�ϴ� ���縦 �������ִ� �޼ҵ�
	Teacher teacherByTno(int tno) {
		Teacher returnTeacher = null;
		
		for(int i = 0; i < tList.size();i++) 
			if(tList.get(i).getTno() == tno) {
				returnTeacher = tList.get(i);
				break;
			}


			return returnTeacher;
	}
	

	
	void tFileRead(String fileName) {
		
		try {
		Scanner scan = new Scanner(new File(fileName));
		
		while(scan.hasNext()) {
			
			String[] str = scan.next().split(",");
			int tno = Integer.parseInt(str[0]);
			String name = str[1];
			String tel = str[2];
			String part = str[3];
			int age = Integer.parseInt(str[4]);
			
			tList.add(new Teacher(tno,name,tel,part,age));
			
		}
		
		scan.close();
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}
	}



	public List<Teacher> gettList() {
		return tList;
	}

	public void settList(List<Teacher> tList) {
		this.tList = tList;
	}
	
	
}
