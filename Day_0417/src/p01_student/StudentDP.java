// �л� ���� ó�� Ŭ����. ������ �۾�

package p01_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDP {

	List<StudentInfo> sList = new ArrayList<StudentInfo>();	// ��� ����Ʈ ����
	
	int answerSize = 10; // ���� ����
	
	int[] answer = new int[answerSize];	// ���� �迭
	
	int[] answerCntArr = new int [answerSize];	// 
	int[] answerRatioArr = new int[answerSize];

	
	public StudentDP() {}
	
	public StudentDP(int[] answer) {	// ���θ޼ҵ忡�� ����ǥ�� �޾ƿ�
		this.answer = answer;
	}


	void body() {	// �޼ҵ���� �������� ���� �޼ҵ�
		
		scoring();	// �л� ������ �����ű��
		calAnswerRatio();	// ������ ���� ���� ���
		printTitle();	// Ÿ��Ʋ ���	
		printBody();	// ������ ���
	}
	
	void printBody() {	// ������ �����͸� ������ִ� �޼ҵ�
		
		for(int i = 0; i < sList.size() ; i++) {	// �л� �����ŭ �ݺ�
			
			System.out.print(sList.get(i).getStuNum() + "\t");	// �л���ȣ ���
			System.out.print(sList.get(i).getStuName() + "\t");	// �л� �̸� ���
			
			for(int j = 0; j < answer.length ; j++) {	// ���� ������ŭ �ݺ�
				System.out.print(sList.get(i).getErrata()[j] + "\t");	// ����ǥ�� ���
				//System.out.print(sList.get(i).getStuAnswer()[j] + "\t");
			}
			System.out.print(sList.get(i).getScore());	// ������ ���
			
			System.out.println();
		}
		
		
		
		System.out.print("���� ���� : \t");		// ������ ���� ������ ���
		for(int i = 0; i < answerRatioArr.length ; i++) {	// ���� ���� ŭ �ݺ��ؼ�
			System.out.print(answerRatioArr[i] + "%\t");	// ����� ���� ���
		}
		
	}
	
	
	void printTitle() {	// Ÿ��Ʋ ���
		System.out.println("\t\t\t**������ ä�� ���ǥ**");
		System.out.print("��ȣ\t�̸�\t");
		for(int i = 0; i < answer.length ; i ++) 
			System.out.print((i+1) + "\t");
		System.out.print("����");
		System.out.println();
	}
	
	void calAnswerRatio() {	// ������ ������ ���
	
		int cnt = 0;	// ������ ��� �¾ҳ� ī��Ʈ
		for(int i =0; i < answerCntArr.length;i++) {	// ���� ������ŭ �ݺ�
			cnt = 0;	// ī���͸� 0���� �ʱ�ȭ
			for(int j = 0; j < sList.size();j++) {	// �л� �����ŭ �ݺ�
				if(sList.get(j).getErrata()[i] == 'O')	// ���� �¾�����
					cnt++;	// ī��Ʈ ����
			}
			answerCntArr[i] = cnt;	// ������ ���� ��� ������� ������ �����ϴ� �迭�� ����
		}
		
		
		for(int i = 0; i < answerCntArr.length;i++) {	// ���� ������ �迭�� ������
			
			if(answerCntArr[i] == sList.size())	// ���� ���� ������ ��ü �ο����� ������
				answerRatioArr[i] = 100;	// 100������ ��. ��� �ؿ��� �ص��Ǵµ� ���� ������ 11�� �� �̷��� 100�� �ȳ����� 99 �̷������� ���ͼ� �ʿ��Ѱ�
			else
				answerRatioArr[i] = 100/sList.size() * answerCntArr[i];	// �ѹ����� ���� ����ؼ� ������ �����ִ� ��.
		}
		
	}
	
	void scoring() {

		int score4question = 100/answer.length;	// �ѹ����� ���� ���
		
		int score = 0;	// �л� ������ ������ ������ ����
	
		
		for (int i = 0; i < sList.size(); i++) {	// �л� �����ŭ �ݺ�
			
			score = 0;	// 0���� �ʱ�ȭ
			
			for (int j = 0; j < answer.length; j++) {//// ���� ������ŭ �ݺ�
				if (answer[j] == sList.get(i).getStuAnswer()[j]) {	// ���� �л��� �� ��� ������ ��ġ�ϸ�
					sList.get(i).getErrata()[j] = 'O';	// ����ǥ �迭�� O �� ����
					score += score4question;	// ������ ������Ŵ
					
				} else {	// �ƴϸ�
					sList.get(i).getErrata()[j] = 'X'; // ����ǥ�� X�� ����
				}

			}////
			sList.get(i).setScore(score);	// ������ ��������
		}	// �ٱ� for���� ����

	}

	void readFile(String fileName) {	// ������ �������� �о �̰��� ������ �л����� ��ü ����

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext())
				sList.add(new StudentInfo(scan.next()));

			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���ϸ��Դϴ�");
		}

	}

}
