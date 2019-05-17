
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 74;
		String str = "";
		double bin = 0;
		int mult = 1;
		
		while (a > 0) {

			if (a % 2 == 1) {
				str = "1" + str;
				bin +=1;
			}
			else {
				str = "0" + str;
			}
			bin /= 10;
			mult *= 10;
			a = a / 2;
		}

		System.out.println((int)(bin*mult+0.1));
		System.out.println(str);
	}

}
