package P02_SawonPay;

public class SawonPay {

	private String id;	// 사원 아이디
	private int grade;	// 사원 등급
	
	private int	workTime;	// 일한시간
	private int h_pay;	// 시급
	private int w_pay;	// 주급
	
	
	public SawonPay() {}	// 디폴트 생성자
	public SawonPay(String id, int grade, int workTime) { // 아이디 사원등급 일한시간을 입력받아서	
		this.id = id;	// 각각에 대입
		this.grade = grade;
		this.workTime = workTime;
		//객체를 생성하자마자 나머지들을 바로 계산할 수 있도록 생성자 안에서 메소드를 호출해줄거임
		setWorkTime();		// 일한시간이 50시간 이상일시 50시간으로 고정해주는 메소드
		setHpay();	// 등급에 따라 시급을 결정해주는 메소드
		calWpay();	// 일한 시간과 시급을 가지고 주급을 계싼해주는 메소드
		
		
	}
	
	static void printTitle() {	// 타이틀 출력해줌. 스테틱 선언했음
		System.out.print("아이디\t");
		System.out.print("등급\t");
		System.out.print("시급\t");
		System.out.print("근무시간\t");
		System.out.print("주간급여\t");
		System.out.println();
	}
	
	@Override
	public String toString() {	// 오버라이딩 했음
		// TODO Auto-generated method stub
		return grade + "\t" + id + "\t" + h_pay +"\t" + workTime + "\t" + w_pay;
	}
	
	private void setWorkTime() {	// 50시간 이상일시 50시간으로 고정해주는 메소드 
		if(workTime>50)	// 입력이 50시간 이상이면
			workTime = 50;	// 50시간으로 바꿔줌
	}
	
	private void setHpay(){	// 등급에 따라 시급을 정해주는 메소드
		
		if(grade == 1)	// 1등급이면
			h_pay = 10000;	// 시급 만원
		else if (grade == 2)	// 말안해도 아시겠죠?
			h_pay = 5000;
		else
			h_pay = 3000;
	}
	
	private void calWpay() {	// 주급을 계산해주는 메소드
		
		if(workTime < 36)	//36시간 이하면
			w_pay = h_pay*workTime;	// 시급에 일한시간을 곱해줌
		else {	// 36시간 초과면
			w_pay = (int)(36*h_pay + (workTime-36)*h_pay*1.5);
			//36시간은 그대로 계산해주고  36시간 초과시간에 대해서만 1.5배 적용해서 계산
		}
		
	}
	
	// 게터랑 세터
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
