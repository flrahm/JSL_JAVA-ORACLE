package P02_SawonPay;

public class SawonPay {

	private String id;	// ��� ���̵�
	private int grade;	// ��� ���
	
	private int	workTime;	// ���ѽð�
	private int h_pay;	// �ñ�
	private int w_pay;	// �ֱ�
	
	
	public SawonPay() {}	// ����Ʈ ������
	public SawonPay(String id, int grade, int workTime) { // ���̵� ������ ���ѽð��� �Է¹޾Ƽ�	
		this.id = id;	// ������ ����
		this.grade = grade;
		this.workTime = workTime;
		//��ü�� �������ڸ��� ���������� �ٷ� ����� �� �ֵ��� ������ �ȿ��� �޼ҵ带 ȣ�����ٰ���
		setWorkTime();		// ���ѽð��� 50�ð� �̻��Ͻ� 50�ð����� �������ִ� �޼ҵ�
		setHpay();	// ��޿� ���� �ñ��� �������ִ� �޼ҵ�
		calWpay();	// ���� �ð��� �ñ��� ������ �ֱ��� ������ִ� �޼ҵ�
		
		
	}
	
	static void printTitle() {	// Ÿ��Ʋ �������. ����ƽ ��������
		System.out.print("���̵�\t");
		System.out.print("���\t");
		System.out.print("�ñ�\t");
		System.out.print("�ٹ��ð�\t");
		System.out.print("�ְ��޿�\t");
		System.out.println();
	}
	
	@Override
	public String toString() {	// �������̵� ����
		// TODO Auto-generated method stub
		return grade + "\t" + id + "\t" + h_pay +"\t" + workTime + "\t" + w_pay;
	}
	
	private void setWorkTime() {	// 50�ð� �̻��Ͻ� 50�ð����� �������ִ� �޼ҵ� 
		if(workTime>50)	// �Է��� 50�ð� �̻��̸�
			workTime = 50;	// 50�ð����� �ٲ���
	}
	
	private void setHpay(){	// ��޿� ���� �ñ��� �����ִ� �޼ҵ�
		
		if(grade == 1)	// 1����̸�
			h_pay = 10000;	// �ñ� ����
		else if (grade == 2)	// �����ص� �ƽð���?
			h_pay = 5000;
		else
			h_pay = 3000;
	}
	
	private void calWpay() {	// �ֱ��� ������ִ� �޼ҵ�
		
		if(workTime < 36)	//36�ð� ���ϸ�
			w_pay = h_pay*workTime;	// �ñ޿� ���ѽð��� ������
		else {	// 36�ð� �ʰ���
			w_pay = (int)(36*h_pay + (workTime-36)*h_pay*1.5);
			//36�ð��� �״�� ������ְ�  36�ð� �ʰ��ð��� ���ؼ��� 1.5�� �����ؼ� ���
		}
		
	}
	
	// ���Ͷ� ����
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	public int getW_pay() {
		return w_pay;
	}
	public void setW_pay(int w_pay) {
		this.w_pay = w_pay;
	}
	
	
	
	
}
