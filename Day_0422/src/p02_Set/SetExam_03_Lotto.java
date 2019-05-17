package p02_Set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam_03_Lotto {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		for(int i = 0; i < 6;i++)
			lotto.add(((int)(Math.random()*45))+1);

		System.out.println(lotto);
		List<Integer> lottoList = new ArrayList<Integer>(lotto);
		Collections.sort(lottoList);
		System.out.println(lottoList);
	}

}
