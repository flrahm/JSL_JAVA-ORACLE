package student;

public class Student {

	private int bun; // 번호를 저장
	private String name; // 이름을 저장
	private int[] jumsu = new int[5]; // 과목 5개를 저장
	private int tot; // 총점을 저장
	private double ave; // 평균을 저장
	private int rank; // 평균 혹은 총점에 의한 순위를 저장

	public Student() { // 생성자. 저는 안썼습니다
	}

	public void getData(String inStr) { // 파일 한줄 전체를 스트링으로 받음
		inStr.trim(); // 공백 제거
		String[] str = inStr.split(","); // "," 로 분리함

		bun = Integer.parseInt(str[0]); // 첫번째 문자열 조각을 인티저 형으로 바꾸어 번호에 저장
		name = str[1]; // 두번째 조각을 이름에 저장
		for (int i = 0; i < jumsu.length; i++) { // 과목 5개가 있음
			jumsu[i] = Integer.parseInt(str[i + 2]); // 점수배열에 3번째 조각부터 7번째 조각까지 저장
		}

		makeAve(); // 평균과 총점을 구하는 메소드를 실행시킴

	}

	private void makeAve() {
		tot = 0; // 평균을 저장할 변수
		for (int i = 0; i < jumsu.length; i++) { // 점수가 저장된 배열을 돌려서 총점에 다 더해줌
			tot += jumsu[i];
		}

		ave = 1.0 * tot / 5; // 평균을 구해줌
	}

	public static void printTitle() {
		System.out.println("번호\t이름\t총점\t평균\t석차"); // 스테틱선언, 타이틀을 출력함
	}

	public void printStd() { // 클래스 요소들을 출력하는 메소드
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}

	public int getBun() { // 프라이빗 변수인 번호를 가져오는 메소드. 메인쪽에서 번호 정렬할때 쓸꺼임
		return bun;
	}

	public double getAve() { // 프라이빗 변수인 평균를 가져오는 메소드. 메인쪽에서 랭킹을 매길때 쓸꺼임
		return ave;
	}

	public void setRank(int rank) { // 프라이빗 변수인 랭크값을 설정하는 메소드. 메인쪽에서 랭킹을 매길때 쓸꺼임
		this.rank = rank;
	}

}
