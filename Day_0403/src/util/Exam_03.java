package util;

import com.abc.AA;	// com.abc 패키지의 aa 클래스를 임포트
// inport com.abc.*;	// com.abc 패키지의 모든 클래스 임포트

public class Exam_03 {
	
	AA a = new AA();	// 패키지가 달라서 그냥은 안됨. ctrl + space + o 로 importing 해줘야댐
	BB b = new BB();	// 같은패키지 내에서는 그냥 가능
}
