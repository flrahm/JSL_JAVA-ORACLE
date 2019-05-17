package stringExam;

import java.util.StringJoiner;

public class Ex02_StringJoiner {

	public static void main(String[] args) {
		
		String[] str = {"010" , "2453" , "3567", "java" , "programming"};
		String str1 = String.join(" ",str);	// static method. combining String
		System.out.println(str1);
		
		//combining String way 2
		StringJoiner sj = new StringJoiner(",");
		
		for(String s : str) {
			sj.add(s);
		}
		
		System.out.println(sj);
		
	}

}
