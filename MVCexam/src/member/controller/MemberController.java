package member.controller;

import java.util.Scanner;

import member.action.Action;

public class MemberController {

	public void processRequest(Action action, Scanner scan) {//

		try {
			action.execute(scan);
		} catch (Exception e) {
			System.out.println(e);
		}

	}//

}
