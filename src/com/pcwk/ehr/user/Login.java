package com.pcwk.ehr.user;

import java.util.Scanner;

public class Login {

	private boolean isLogin = false; // 로그인 상태값
	private String inputAN = ""; // 로그인 계좌의 계좌번호 입력값
	private String inputPw = ""; // 로그인 계좌의 계좌 비밀번호 입력값
	Scanner scanner = new Scanner(System.in);

	public Login() {

	}


	public void Login() {

		System.out.print("계좌번호를 입력하세요: "); 
		inputAN = scanner.nextLine();

		System.out.print("비밀번호를 입력하세요: ");
		inputPw = scanner.nextLine();
		
		for(AccountVO account : AccountDao.accounts) {
			if(account.getAccountNo().equals(inputAN) && account.getUserPw().equals(inputPw)) {
				System.out.println("로그인 성공!");
				isLogin = true;
				return;
			}
			
			System.out.println("로그인 실패! 계좌번호 혹은 비밀번호가 일치하지 않습니다.");
			isLogin = false;
		} 
	} // Login() end
}
