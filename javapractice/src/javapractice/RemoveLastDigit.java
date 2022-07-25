package javapractice;

import java.util.Scanner;

public class RemoveLastDigit {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sn.nextInt();
		int c=a/10;
		System.out.println(c);

	}

}
