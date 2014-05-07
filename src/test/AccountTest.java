package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Account;

/*
 * ���� ����� 3����
 * �ܰ���ȸ
 * �Ա�
 * ���
 * */
public class AccountTest {
	
	//���¸� �����Ѵ� -> ���°� ���������� �����ƴ��� Ȯ���Ѵ�.
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	
//	�ܰ� ��ȸ
//	1000������ ���� ����
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
//			test.testAccount();	//�׽�Ʈ ���̽� ����.
//		} catch (Exception e) {
//			System.out.println("����(X)");
//			return;
//		}
//		System.out.println("����(O)");
	
	

//			
//	

}
