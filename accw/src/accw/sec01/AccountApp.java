package accw.sec01;

import java.util.Scanner;

public class AccountApp {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean run = true;
        int money;
        int acc;
        String inputStr = "";
        
        Account account = new Account("312-89562-123456");
        
        try {
	        while(run){
	            System.out.println("");
	            System.out.println(account.getAccountNum());
	            System.out.println("");
	            System.out.println("----------------------------------------");
	            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.계좌번호 변경 |5.종료");
	            System.out.println("----------------------------------------");
	            System.out.print("선택>");
	            
	            int menuNo = sc.nextInt();
	            
	            switch(menuNo){
	            
	                case 1:
	                    System.out.print("예금액>");
	                    money = sc.nextInt();
	                    account.deposit(money);
	                    break;
	                
	                case 2:
	                    System.out.print("출금액>");
	                    money= sc.nextInt();
	                    account.withdraw(money);
	                    break;
	                    
	                case 3:
	                    System.out.print("잔고액>");
	                    account.showBalance();
	                    break;
	                
	                case 4:
	                    System.out.print("변경번호 계좌>");
	                    inputStr = sc.next();
	                    System.out.println(inputStr);
	                    account.showacc(inputStr);
	                    break;
	                    
	                case 5:
	                    System.out.print("프로그램 종료");
	                    run = false;
	                    break;
	                    
	                default :
	                    System.out.println("다시입력해주세요");
	                    continue;
	                    
	            }//switch 
	            
	        }//while
	        
		} catch (Exception e) {
			System.out.println("너 뭐냐? 숫자만 넣어라.. 다시해야지... " + e.getMessage());
		} finally {
			sc.close();
		}
        
    }
}


