class Student{
	
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	
	private int sum;
	private double ave;
	
	Student(){}
	Student(int num, String name, int kor , int eng, int mat){
		
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	private void stdSum() {
		sum = kor + eng + mat;
		ave = 1.0 * sum/3;
		ave = ((int)(ave*100+0.5))/100.0;	
	}
	
	private void titlePrint() {
		System.out.println("��ȣ\t" +"�̸�\t" +"����\t" +"����\t" +"����\t" +"����\t" +"���\t");
	}
	
	void stdPrint() {

		stdSum();
		titlePrint();
		
		System.out.print(num + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(sum + "\t");
		System.out.print(ave + "\t");
		System.out.println();
		//�и�
	}
}




public class Class_Student {

	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿",100,100,99);
		s1.stdPrint();

		
	}

}
