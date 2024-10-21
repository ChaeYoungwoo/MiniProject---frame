package com.pcwk.ehr.user;

import java.util.Scanner;

public class Deposit {
	AccountDao dao = new AccountDao();
	Scanner scanner = new Scanner(System.in);
	public Deposit() {
		
	}

	public void deposit() {
		
		System.out.print("계좌에 입금하실 금액을 입력해주세요: ");
		double depositAmount = scanner.nextDouble();
		
		System.out.println("입금 전 잔고: " + AccountVO.loginVO.getBalance());
		AccountVO.loginVO.setBalance(depositAmount + AccountVO.loginVO.getBalance());
		System.out.println("소유주명: " + AccountVO.loginVO.getUserName());
		System.out.println("입금 후 잔고: " + AccountVO.loginVO.getBalance());
	}
}
