package javapractice;

import java.util.Scanner;

public class EndsWithOne {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a num");
		long d=656515546565616l;
		
		if(d%100000==0)
		{
			long i=d%10000;
			System.out.println("ytyty"+i);
		}
		else
		{
			long i=d/10000000;
			long k=i%10;

			System.out.println("no"+k);
		}

	}

}
