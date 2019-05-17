package Sawon.controller;

import java.util.Scanner;

import Sawon.action.Action;

public class SawonController {
	public void processRequest(Action action, Scanner scan) {//

		try {
			action.execute(scan);
		} catch (Exception e) {
			System.out.println(e);
		}

	}//
}
