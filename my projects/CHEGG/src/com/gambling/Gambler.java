package com.gambling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Gambler {
	
	public static void main(String[] args) throws IOException {
			boolean flag=true;	
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		int moneyInt=0;
		System.out.println("Enter Money to Gamble");  
		String money=br.readLine(); 
		if(money!=null || money!=""){
		moneyInt=Integer.parseInt(money);
		if(moneyInt<=0)
		{
			System.out.println("Please enter positive amount!");
			flag=false;
		}
		}else
		{
			System.out.println("Entered Amount is zero, Please enter it again!");
			flag=false;
		}
		if(flag){
		System.out.println("Let's play the game..with amount :"+moneyInt);  
		GamlingMachine gm=new GamlingMachine();
		gm.playGame(moneyInt);
		}
	}
	
	
	
	

}
