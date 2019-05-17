package student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import student.dao.StudentData;
import student.vo.Student;

public class StudentTest {

	public static void main(String[] args) throws Exception{

	
		Scanner scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0410\\studentData.txt"));
		
		List<Student> sList = new ArrayList<Student>();

		String ans;	// 정답표를 저장할 스트링
		ans = scan.next();	// 맨첫번째줄을 정답에 저장
		while (scan.hasNext()) {	// 끝날때까지
			sList.add(new Student(scan.next()));	// 파일 한줄을 읽어서 학생 클래스의 inData에 저장. 생성자별도로 만들었음
		}
		scan.close();
		
		StudentData sData = new StudentData(sList,ans);	// StudentData 클래스에 리스트 전달
		sData.body();	// 실행

	}

}
