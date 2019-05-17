import java.util.Arrays;

public class ArrayBasic_CharArray {

	public static void main(String[] args) {
		
		char[] ch = new char[10];
		ch[0] = 'a';
		ch[3] = 'c';
		
		char a1 = 'a';
		int aa = a1 + 1;
		a1 = (char)aa;
		System.out.println(a1);
		
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);	// char 배열만의 특징으로 가상 주소값이 아니라 배열에 있는 값을 출력해줌
		
		System.out.println("---------------------------");
		
		char[] apb = new char[26];
		
		apb[0] = 'a';
		int temp = apb[0];
		
		for(int i = 1; i <= apb.length-1 ; i++) {
			temp += 1;
			apb[i] = (char)temp;
		}
				System.out.println(apb);
				
	}

}
