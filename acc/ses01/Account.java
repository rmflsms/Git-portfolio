package project.ses01;

public class Account {
//	private String accountNo;
    private int balance;
    private String accountNum ;
 
    //���¹�ȣ
    public Account(String accountNum) {
//        this.accountNo = accountNo;
    	this.accountNum = accountNum;
    }
    public String getAccountNum() {
    	return this.accountNum;
    }
    //�Ա� ���
    public int deposit(int money) {
 
        balance = balance + money;
        return balance;
    }
 
    //��� ���
    public int withdraw(int money) {
 
        balance = balance - money;
        return balance;
    }
 
    //�ܰ� Ȯ�� ���
    public void showBalance() {
        System.out.println(balance);
    }
    
    //���¹�ȣ ����
    public void showacc(String acc ) {
    	 
        this.accountNum = acc;
    }
    
    }




