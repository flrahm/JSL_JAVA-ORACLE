package student.model;

import java.util.List;

import student.vo.Student;

public class StudentModel {

	// 석차 계산용 메소드
	public static void studentRank(List<Student> sList) {

		for (int i = 0; i < sList.size(); i++) {

			int rank = 1;

			for (int j = 0; j < sList.size(); j++)
				if (sList.get(i).getScore() < sList.get(j).getScore())
					rank++;

			sList.get(i).setRank(rank);
		}
	}// 석차 계산용 메소드 끝

	public static void studentSort(List<Student> sList , String order) {
			
		if(order.equalsIgnoreCase("A")) { 
			for(int i = 0; i < sList.size() ; i++) 
				for(int j = 0; j < sList.size() -1 -i ; j++) 
					if(sList.get(j).getRank() < sList.get(j+1).getRank()) {	// 여기의 부등호만 달라짐
						// swap
						Student temp = sList.get(j);
						sList.set(j, sList.get(j+1));
						sList.set(j+1, temp);
				}
		}
		else {
			for(int i = 0; i < sList.size() ; i++) 
				for(int j = 0; j < sList.size() -1 -i ; j++) 
					if(sList.get(j).getRank() > sList.get(j+1).getRank()) {	
						// swap
						Student temp = sList.get(j);
						sList.set(j, sList.get(j+1));
						sList.set(j+1, temp);
				}
		}
						
		
				
	}//
		
}


