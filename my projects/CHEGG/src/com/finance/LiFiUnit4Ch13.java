package com.finance;

public class LiFiUnit4Ch13 {
	
	public static void main(String[] args) {
		LiFiUnit4Ch13Inevstor investor;
		String rate=args[0];
		System.out.println("Interest Rate per month is:"+rate);
		String accountNo=args[1];
		System.out.print("For AccountNumber : "+accountNo);
	
		double rateUnit=Double.parseDouble(rate);
		double simpleInterest=0;
		double initialBalance;
		
		switch(accountNo)
		{
		case "1001":
			investor=new LiFiUnit4Ch13Inevstor(1001, 2000);
			initialBalance=2000;
			for(int t=1;t<13;t++){
			System.out.println("Pricipal :"+initialBalance);
			simpleInterest=(investor.calculateInterest(rateUnit,t,2000))/1200;
			initialBalance=initialBalance+simpleInterest;
			System.out.println("For account 1001, simpleInterest for month : "+t+" = "+simpleInterest+"\n\n");
			
			}
			break;
		case "1002":
			investor=new LiFiUnit4Ch13Inevstor(1002, 4000);
			initialBalance=4000;
			for(int t=1;t<13;t++){
				simpleInterest=investor.calculateInterest(rateUnit, t ,initialBalance);
				System.out.println("For account 1002, simpleInterest for month : "+t+" = "+simpleInterest);
				}
			break;
		default:
			System.out.println("No account Matched with ID:"+accountNo);
		}
		
		//LiFiUnit4Ch13Inevstor investor=new LiFiUnit4Ch13Inevstor();
		LiFiUnit4Ch13 cal=new LiFiUnit4Ch13();
		

	}
	
	

}
