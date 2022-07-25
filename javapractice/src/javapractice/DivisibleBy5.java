package javapractice;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		if(a%5==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
