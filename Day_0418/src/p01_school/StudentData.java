// 학생의 목록과 학생의 목록만을 처리하는 메소드가 담긴 클래스

package p01_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	private List<Student> sList = new ArrayList<Student>();

	public StudentData(String fileName) {
		sFileRead(fileName);
	}

	Student studentByBun(String bun) {	// 번호를 입력해서 해당 번호에 맞는 학생 반환
		Student returnStu = null;

		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getBun().equals(bun)) {
				returnStu = sList.get(i);
				break;
			}
		
		return returnStu;
	}

	// 입력한 학년에 해당하는 학생 리스트 반환
	List<Student> listOfYear(String year) {
		List<Student> returnList = new ArrayList<Student>();
		System.out.println(year + " 학년 학생 목록");

		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getBun().substring(0, 1).equals(year))
				returnList.add(sList.get(i));

		return returnList;
	}

	List<Student> upScore(int score) { // score 이상의 점수를 가진 학생 리스트 반환
		List<Student> returnList = new ArrayList<Student>();

		System.out.println(score + " 점 이상인 학생 목록");
		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getScore() >= score)
				returnList.add(sList.get(i));

		return returnList;
	}

	void sFileRead(String fileName) {

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext()) {

				String[] str = scan.next().split(",");
				String bun = str[0];
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				sList.add(new Student(bun, name, tel, score, tno));

			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
	}

	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}

}
