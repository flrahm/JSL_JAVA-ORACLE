package zipcode.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zipcode.dao.ZipcodeDAO;
import zipcode.vo.ZipcodeVO;

public class ZipcodeExam {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		ZipcodeDAO zDAO = new ZipcodeDAO();
		List<ZipcodeVO> zList = new ArrayList<ZipcodeVO>();
		
		System.out.println("��(��) �Է� : ");
		String dong = scan.next();
		
		zList = zDAO.searchByDong(dong);

		if(!zList.isEmpty())
			for(int i = 0; i < zList.size() ; i++)
				System.out.println(zList.get(i));
		else
			System.out.println("�Է��� ���� ���� �ڷᰡ �����ϴ�");
				
		
		
		scan.close();
	}

}
