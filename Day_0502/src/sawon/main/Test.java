package sawon.main;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(LocalDate.now());
		//LocalDate nowDate = LocalDate.now();
		//String hireDate = "" + nowDate.getYear() + "/" + nowDate.getMonthValue() + "/" + nowDate.getDayOfMonth();
		//System.out.println(hireDate);
	

		int year = 1992;
		int month = 5;
		int day = 15;
		try {
		LocalDate myDate = LocalDate.of(year,month,day);
		String hireDate = "" + myDate.getYear() + "/" + myDate.getMonthValue() + "/" + myDate.getDayOfMonth();
		System.out.println(hireDate);
		}catch(DateTimeException e) {
			System.out.println(" 잘못된 날짜 형식입니다 ");
		}
	}		
}
