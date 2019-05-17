// StudentSearch Data
package P03;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	List<Student> sList = null;
	public StudentList() {
		
		sList = new ArrayList<Student>();
		
		sList.add(new Student(5,"AAA",85));
		sList.add(new Student(9,"BBB",65));
		sList.add(new Student(3,"CCC",99));
		sList.add(new Student(8,"DDD",25));
		sList.add(new Student(4,"EEE",41));
		sList.add(new Student(1,"FFF",95));
		sList.add(new Student(2,"GGG",90));
		sList.add(new Student(7,"HHH",45));
		sList.add(new Student(6,"III",15));
		
	}
	
	public void scoreList(int score) {	// score �̻��� �л��� ����� ����ϴ� �޼ҵ�
		
		int cnt = 0;	// �л� ����� ���� ����
		System.out.println("������ " + score + " �̻��� �л��� ��� ");
		
		for(int i = 0; i < sList.size() ; i++) {	// ����Ʈ �� ��ŭ �ݺ�
			
			if(score < sList.get(i).getScore()) {	// score �� �л� ������ ���ؼ�
				System.out.println(sList.get(i));	// ���� ���� �̻��̸� ���. toString �������̵� �Ǿ�����
				cnt++;	// ���� ����
			}
		}
		
		System.out.println("������ " + score + "�̻��� �л� �� : " + cnt + " ��");
		
		
		
	}
	
	public void nameSearch(String name) {	// �Է¹��� name �� �������� �̸��� ��ġ�ϴ� �л��� ã�� �޼ҵ�
		
		Student std = null;	// ���� ���� Student Class ���� 
		for(int i = 0; i < sList.size() ; i++) {	// ����Ʈ �� ��ŭ �ݺ��ؼ�
			if(name.equals(sList.get(i).getName())) {	// �̸��� �ҷ��� ���ڿ��� ��ġ�ϸ� 
				std = sList.get(i);	// std �� ������ ����
				break;	// ��������
			}
		}
			
		if(std == null)	// ���� null ���̸� ( ��ġ�ϴ� �л��� ã�� ������ ��)
			System.out.println("�ش� �̸��� ���� �л��� �����ϴ� : " + name);
		else	// �ƴϸ� ���. toString �������̵� �Ǿ�����
			System.out.println(std);
	}
	
}
