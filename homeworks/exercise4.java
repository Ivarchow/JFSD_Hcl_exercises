package domain.hcl.homeworks;

import java.util.Scanner;

/*
 * Problem Statement:

Personalize the Hello World program with your name so that it tells you Hello rather than the somewhat generic "World."

Problem Statement:

Write a program that produces the following output:

 

Hello World!

It's been nice knowing you.

Goodbye world!
 */

public class exercise4 {
	public static void main(String[] args) {
		Scanner name_scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String userName = name_scanner.nextLine();
		System.out.println("Hello " + userName+"\n"+"It's been nice knowing you."+"\n"+ "Goodbye "+userName);
	}

}
