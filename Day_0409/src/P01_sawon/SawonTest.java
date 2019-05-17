package P01_sawon;

import java.time.LocalDate;
import java.time.LocalTime;

public class SawonTest {

	public static void main(String[] args) {
		LocalTime sTime = LocalTime.now();
		System.out.println(sTime);
		Sawon sa = new Sawon();
		
		sa.setSabun(1);
		sa.setName("Seol");
		sa.setPart("jsl_35");
		sa.setRegdate(LocalDate.now());
		System.out.println(sa.toString());
		
		Sawon sa2 = new Sawon(2,"Kim" , "jsl_34" , LocalDate.of(2018, 12, 21));
		System.out.println(sa2);
		
		LocalTime eTime = LocalTime.now();
		System.out.println(eTime);
		
		
	}

}
