package student.dao;

import java.util.ArrayList;
import java.util.List;

import student.vo.Student;

public class StudentData {

	List<Student> sList = new ArrayList<Student>();	// Student ����Ʈ�� ����ϱ� ���ؼ� ����
	String[] ans;	// ������ ������ �޾ƿ������� ���
	
	public StudentData() {}
	public StudentData(List<Student> sList , String ans) {
		this.sList = sList;
		this.ans = ans.split(",");
	}
	
	public void body() {	// �����Լ� �����
		
		splitData();	// ������ �ɰ���
		scoring();	// �����ű��
		ranking();	// ����ű��
		sorting();	// ����� ����
		printTitle();	// Ÿ��Ʋ ���
		printScore();	// ������ ���
	}
	
	private void sorting() {	// �������� 
		
		for(int i = 0; i < sList.size() ; i++) {
			for (int j = 0; j < sList.size() - 1 - i ; j++) {
				if(sList.get(j).getRank() > sList.get(j+1).getRank()) {	
					
					// swap
					Student temp = sList.get(j);
					sList.set(j, sList.get(j+1));
					sList.set(j+1, temp);
				}
				
			}
		}
		
	}
	
	private void ranking() {	// ����ű��
		int rank;
		for(int i = 0; i < sList.size() ; i++) {
			rank = 1;
			
			for(int j = 0; j < sList.size(); j++) {
				if(sList.get(i).getScore() < sList.get(j).getScore())	// ���ھ �������� �����ű��
					rank++;
			}
			sList.get(i).setRank(rank);
			
		}
	}
	
	private void printTitle() {	// ���� ���
		System.out.println("\t\t �����϶�ǥ");
		System.out.println("��\t��ȣ\t�̸�\t����\t����");
	}
	
	private void printScore() {	// ���� ���
		// �� ��ȣ �̸� ���� ����
		for(int i = 0; i < sList.size();i++) {
			
			System.out.print(sList.get(i).getBan());
			System.out.print("\t");
			System.out.print(sList.get(i).getNum());
			System.out.print("\t");
			System.out.print(sList.get(i).getName());
			System.out.print("\t");
			System.out.print(sList.get(i).getScore());
			System.out.print("\t");
			System.out.print(sList.get(i).getRank());
			
			System.out.println();
		}
		
	}
	
	
	private void scoring() {	// �����ű��
		
		for(int i = 0; i < sList.size();i++) {	// �л� �����ŭ �ݺ�
		
		int score = 0;	// �ʱⰪ 0���� ����
		//
		String[] dap = sList.get(i).getDap();	// �л� �������� ���� �ҷ��ͼ� �����س���
		for(int j = 0; j < ans.length ; j++) {	// ���� ���̸�ŭ �ݺ��ؼ�
			if(dap[j].equals(ans[j])) {	// ��� �´��� �˻�
				score+= 10;	// ������ 10�����ϱ� 10����
			}
		}
		//
		sList.get(i).setScore(score);	// ������ ����
		}
	}
	
	private void splitData() {	// �� ó�� ������ ���°� �и��ϱ�
		
	
		for(int i = 0; i < sList.size() ; i++) {	// �л� ��� ��ŭ �ݺ�
			
			String[] str = sList.get(i).getInData().split(",");	// inData�� �����ͼ� �ڸ��� 
			sList.get(i).setBan(str[0]);	// ù��° ������ �ݿ�
			sList.get(i).setNum(str[1]);	// �ι�° ������ ��ȣ��
			sList.get(i).setName(str[2]);	// ����° ������ �̸���
			
			String[] dap = new String[str.length-3];	// ������ ������ ���� �迭��
			for(int j = 0; j <str.length-3 ; j++ ) {
				dap[j] = str[j+3];
			}
			sList.get(i).setDap(dap);
		}
		
	}
///
}
