package javapractice;

import java.util.Scanner;

public class PrintLastDigit {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		int b=a%10;
		
		
		System.out.println(b);
		

	}

}
