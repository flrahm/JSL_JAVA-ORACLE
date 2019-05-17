package Sawon.main;

import Sawon.dao.SawonDao;
import Sawon.vo.SawonVO;

public class SawonMain01 {

	public static void main(String[] args) throws Exception {
		
		SawonDao sDao = new SawonDao();
		
		int num = 17;
		String name = "KIM";
		String tel = "010-2345-5233";
		int pay = 5000;
		
		SawonVO sa = new SawonVO();
		sa.setName(name);
		sa.setPay(pay);
		sa.setSno(num);
		sa.setTel(tel);
		
		int row = sDao.sawonInsert(sa);
		System.out.println(row);

	}

}
