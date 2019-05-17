// 학생체중 데이터 처리 클래스

package StudentWeight;

import java.util.ArrayList;
import java.util.List;

public class StudentWeight_dataProcess {

	List<StudentWeight> sList = new ArrayList<StudentWeight>();
	int maxWeight;
	int minWeight;

	public StudentWeight_dataProcess(List<StudentWeight> sList) {
		this.sList = sList;
	}

	void body() {

		sortByBan(); // 반을 기준으로 정렬
		calMinAndMax(); // 최대체중 최소체중 계산
		printTitle(); // 타이틀 출력
		printBody(); // 나머지 출력
	}

	void printBody() {

		int nowBan = sList.get(0).getBan();	// 현재 반을 맨 처음 배열의 반으로 설정
		boolean sw = true;	// 반을 찍을 스위치.

		for (int i = 0; i < sList.size(); i++) {

			if (sw == true) {	// 스위치가 켜져있으면
				System.out.print(nowBan + "\t");	// 반을 찍고
				sw = false;	// 스위치를 끔
			} else
				System.out.print("\t");	// 꺼져있으면 그냥 탭만 직음

			System.out.print(sList.get(i).getStdNum() + "\t");	// 번호를 찍음
			System.out.print(sList.get(i).getWeight() + "\t");	// 체중을 찍음

			if (i < sList.size() - 1 && sList.get(i + 1).getBan() != nowBan) {
				// i-1 번째이고 현재 반이랑 그 다음 반이랑 다르면 (반이 바뀌면)
				nowBan = sList.get(i + 1).getBan();	// 프린트를 찍을 반을 바뀌는 값으로 바꿔줌
				sw = true;	// 스위치를 켬
			}

			System.out.println();

		}
		System.out.println("최대 체중 : " + maxWeight);		// 최대체중출력
		System.out.println("최소 체중 : " + minWeight);		// 최소체중 출력

	}

	void sortByBan() {	// 반을 기준으로 정렬

		for (int i = 0; i < sList.size(); i++)
			for (int j = 0; j < sList.size() - i - 1; j++)
				if (sList.get(j).getBan() > sList.get(j + 1).getBan()) {
					StudentWeight temp = sList.get(j);
					sList.set(j, sList.get(j + 1));
					sList.set(j + 1, temp);
				}

	}

	void printTitle() {	// 타이틀 찍기
		System.out.println("반\t번호\t체중");
	}

	void calMinAndMax() {	// 최대 최소체중 구하는 메소드
		maxWeight = sList.get(0).getWeight();
		minWeight = sList.get(0).getWeight();

		for (int i = 0; i < sList.size(); i++) {
			if (maxWeight < sList.get(i).getWeight())
				maxWeight = sList.get(i).getWeight();

			if (minWeight > sList.get(i).getWeight())
				minWeight = sList.get(i).getWeight();
		}

	}

}
