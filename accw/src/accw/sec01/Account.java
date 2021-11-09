package accw.sec01;




public class Account {
//	private String accountNo;
    private int balance;
    private String accountNum ;
 
    //계좌번호
    public Account(String accountNum) {
//        this.accountNo = accountNo;
    	this.accountNum = accountNum;
    }
    public String getAccountNum() {
    	return this.accountNum;
    }
    //입금 기능
    public int deposit(int money) {
 
        balance = balance + money;
        return balance;
    }
 
    //출금 기능
    public int withdraw(int money) {
 
        balance = balance - money;
        return balance;
    }
 
    //잔고 확인 기능
    public void showBalance() {
        System.out.println(balance);
    }
    
    //계좌번호 변경
    public void showacc(String acc ) {
    	 
        this.accountNum = acc;
    }
    
    }






