package javapractice;

import java.util.Scanner;

public class EndsWithZero {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		if(a%10==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
