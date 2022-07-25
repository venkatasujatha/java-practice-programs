package javapractice;

import java.util.Scanner;

public class Multi3And5 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		if(a%3==0 && a%5==0) 
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
