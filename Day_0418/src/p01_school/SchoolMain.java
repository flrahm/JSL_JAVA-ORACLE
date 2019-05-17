// 메인메소드

package p01_school;

public class SchoolMain {

	public static void main(String[] args) {
		
		String sFileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0418//student.txt";
		String tFileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0418//teacher.txt";
		
		StudentData sData = new StudentData(sFileName);
		TeacherData tData = new TeacherData(tFileName);

		/*
		// 전체 리스트 출력
		System.out.println("전체 리스트 출력");
		SchoolModel.printSList(sData.getsList());
		System.out.println();
		SchoolModel.printTList(tData.gettList());
		System.out.println("------------------------------");
		System.out.println();
		*/
		// 교사번호를 입력하여 해당 교사가 담당하는 학생 목록 출력 
		int tno = 13;
		SchoolModel.printSList(SchoolModel.sListByTno(sData.getsList(), tData.teacherByTno(tno)));
		System.out.println();
		int tno2 = 15;
		SchoolModel.printSList(SchoolModel.sListByTno(sData.getsList(), tData.teacherByTno(tno2)));
		System.out.println();
		System.out.println("------------------------------");
		// 입력 점수 이상을 가진 학생 목록 출력
		SchoolModel.printSList(sData.upScore(70));
		System.out.println();
		System.out.println("------------------------------");
		// 입력 학년에 해당하는 학생 목록 출력
		SchoolModel.printSList(sData.listOfYear("1"));
		System.out.println();
		System.out.println("------------------------------");
		// 입력 나이 이상을 가진 선생 목록 출력
		int age = 30;
		SchoolModel.printTList(tData.upAge(age));
		System.out.println();
		System.out.println("------------------------------");
		// 학생 번호를 입력해서 담당 교사를 출력
		String bun = "2123";
		SchoolModel.printTeacherByStudentTno(tData.gettList(), sData.studentByBun(bun));
		String bun2 = "9999";
		SchoolModel.printTeacherByStudentTno(tData.gettList(), sData.studentByBun(bun2));
	}

}
