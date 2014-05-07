package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Account;

/*
 * 계좌 기능은 3가지
 * 잔고조회
 * 입금
 * 출금
 * */
public class AccountTest {
	
	//계좌를 생성한다 -> 계좌가 정상적으로 생성됐는지 확인한다.
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	
//	잔고 조회
//	1000원으로 계좌 생성
	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if( account.getBalace() != 10000) {
			fail("Error Occured!"); 
		}
		
		account = new Account(1000);
		if(account.getBalace() != 1000){
			fail("Error Occured!");
		}
		
		account = new Account(0);
		if(account.getBalace() != 0){
			fail("Error Occured!");
		}
	}
	
	
//	public static void main(String[] args) {
//		AccountTest test = new AccountTest();
//		try {
//			test.testAccount();	//테스트 케이스 실행.
//		} catch (Exception e) {
//			System.out.println("실패(X)");
//			return;
//		}
//		System.out.println("성공(O)");
	
	

//			
//	

}
