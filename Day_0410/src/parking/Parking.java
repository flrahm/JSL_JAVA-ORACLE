package parking;

public class Parking {

	String carNo;	// 자동차 번호
	int parkTime;	// 주차시간
	int money;	// 주차요금

	public Parking() {
	}

	public Parking(String carNo, int parkTime) {	//자동차 번호와 주차시간을 입력받는 생성자
		this.carNo = carNo;		
		this.parkTime = parkTime;
		feeCal();	// 메인 메소드에서 입력이 끝나면 바로 주차요금을 계산할 수 있게 생성자 안에 주차요금 계산 메소드를 불러줌
	}

	@Override
	public String toString() {	// 출력

		return "차량번호 : " + carNo + "\t주차시간 : " + parkTime + "분\t주차요금 : " + money + "원";
	}

	void feeCal() {

		if (parkTime <= 10)	// 주차시간이 10분 이하면
			money = 0;	// 무료

		else if (parkTime <= 30)	// 10분 이상 30분 이하면
			money = 500;	// 500원

		else {	// 30분 이상이면

			int mul = ((parkTime - 30) + 9) / 10;	// 10분당 500원으로 계산. 맨처음 30분은 빼고 12분이어도 20분 요금으로 출력할 수 있게 9를 더해줌
			int temp = mul * 500 + 500;	// 10분당 요금과 처음 30분 요금 500원을 더해줌
			//예를들어 41분이면 41-30 해서 11분이 되고 9를 더해서 20, 10으로 나누는데 인트형이라 2
			// 2*500 + 500(기본30분요금) 해서 1500원이 나옴
			// 하지만 40분일경우 40-30 해서 10분, 10+9 해서 19, 19/10 해서 1.9인데 인트형이라 1이 됨
			// 1*500 + 500 해서 1000원이 나옴.
			// 40분이면 1000원, 41분이상이면 1500원. 즉, 1분만 초과해도 돈을 더내야 되게 만들어야하니까 9를 더해주는것임
			
			if (temp > 30000)	// 이렇게 나온 결과값이 만약 3만원 이상이면(최대 3만원이니까)
				money = 30000;	// 위에 계산한 값이 아니라 그냥 3만원으로 함
			else
				money = temp;	// 아니면 계산한 요금으로 해줌 
		}
	}
}