// �������̽�. ����. �߻�Ŭ������ ����. �߻�ȭ�� �� ����
// ���, �߻�޼ҵ� �ΰ����� ��

package util;

public interface Sawon {

	// int x;  //�̷��� �ȵ� 
	// public void aaa(){}	 //�̷��� ���� �ȵ�
	
	
	
	
	int MAX = 100; // public final int MAX = 100; �̷��� ���°Ͱ� �Ȱ���. ��������
	void abc(); //public abstract void abc();	// abstract �� ���ʿ䰡 ����. ��������
	
	int add(int x, int y);
	void sum(int ... arr);
}

// �������̽��� "����"�Ѵ�. �߻�Ŭ������ "���"�Ѵ�. 

interface Mem extends Sawon{	 // �������̽��� ����� ����. 
	
}