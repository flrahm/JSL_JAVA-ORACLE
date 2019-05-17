public class Person {

	int num;	//번호를 저장
	String name;	// 이름을 저장
	String regDate;	// 입사일을 저장
	int salary;	// 연봉을 저장
	
	
	int rank;	// 연봉 순위를 저장. 이건 생성자로 입력받는게 아니라 메소드를 돌려서 구현
	
	public Person() {}
	public Person(int num, String name, String regDate, int salary) {	//생성자
		this.num = num;	
		this.name = name;
		this.regDate = regDate;
		this.salary = salary;
	}
	
	public static void printTitle() {
		System.out.println("번호\t이름\t입사일\t\t기본급\t연봉순위");		// 타이틀을 찍는 메소드 
	}
	
	public void printPerson() {	// 클래스 요소들을 일렬로 출력하는 메소드
		
		System.out.print(num + "\t");
		System.out.print(name + "\t");
		System.out.print(regDate + "\t");
		System.out.print(salary + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}
}
