package com.pcwk.ehr.user;

import java.util.Scanner;

public class Menu {
	CreateAccount createAccount = new CreateAccount();
	Login login = new Login();
	Scanner scanner = new Scanner(System.in);

	public void menu0() {

		int input1 = 100;
		while (input1 != 0) {
			System.out.println("┌────────────────────────┐");
			System.out.println("│ WELCOME TO             │");
			System.out.println("│ BABO BANKING SYSTEM !!!│");
			System.out.println("└────────────────────────┘");
			System.out.println("1. 관리자모드");
			System.out.println("2. 사용자모드");
			System.out.println("0. 종료");
			System.out.print("입력: ");
			input1 = scanner.nextInt();
			switch (input1) {
			case 1:
				adminMenu();
				break;
			case 2:
				userMenu();
				break;
			case 0:
				System.out.println("프로그램 종료!");

			}

		}

	}

	public void adminMenu() {

		int input2 = 0;

		do {
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│  BABO BANK ADMINISTRATOR MODE  │");
			System.out.println("└────────────────────────────────┘");

			System.out.println("1. 모든 계좌 정보 조희");
			System.out.println("2. 계좌 비밀번호 변경 ");
			System.out.println("3. 계좌 삭제");
			System.out.println("0. 관리자 모드 종료");
			System.out.print("입력: ");
			input2 = scanner.nextInt();
			switch (input2) {
			case 1:
				// displayAllAcc();
				break;
			case 2:
				// changePw();
				break;
			case 3:
				// deleteAcc();
				break;
			}
		} while (input2 != 0);
	}

	public void userMenu() {
		int input = 0;

		do {
			System.out.println("┌────────────────────────┐");
			System.out.println("│ WELCOME TO             │");
			System.out.println("│ BABO BANKING SYSTEM !!!│");
			System.out.println("└────────────────────────┘");

			System.out.println("1. 계좌 생성");
			System.out.println("2. 로그인");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 송금");
			System.out.println("6. 계좌 정보 조회");
			System.out.println("7. 계좌 삭제 / 계좌 비밀번호 변경 (관리자에게 요청)");
			System.out.println("0. 사용자 모드 종료");

			System.out.print("입력: ");
			input = scanner.nextInt();
			System.out.println("====================================");

			switch (input) {
			case 1: // 계좌 생성

				createAccount.createAccount();
				break;
			case 2: // 로그인

				login.Login();
				break;

			case 3: // 입금
//				if (getIsLogin() == true) {
//					deposit();
//				} else {
//					System.out.println("잘못된 시도입니다.");
//				}
//				break;

			case 4: // 출금
//				if (getIsLogin() == true) {
//					withdraw();
//				} else {
//					System.out.println("잘못된 시도입니다.");
//				}
//				break;
			case 5:
//				// 송금 함수
//				if (getIsLogin() == true) {
//					transfer();
//				} else {
//					System.out.println("잘못된 시도입니다.");
//				}
			case 6:
//				// 계좌 정보 조회 함수
//				if (getIsLogin() == true) {
//					displayAccInfo();
//				} else {
//					System.out.println("잘못된 시도입니다.");
//				}
//				break;

			case 7:
//				if (getIsLogin() == true) {
//					reqAdmin();
//				} else {
//					System.out.println("잘못된 시도입니다.");
//				}

			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} while (input != 0);

	}

}
