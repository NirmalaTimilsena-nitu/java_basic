package chapter_1;

import java.util.Scanner;

public class SwitchCase_Demo {
	public static void main(String args[]) {
		int a, b, c, ch;
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter Your Choice : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		System.out.println("Enter 2 Nos : ");
		a = sc.nextInt();
		b = sc.nextInt();
		switch (ch) {
		case 1:
			c = a + b;
			System.out.println("Addition : " + c);
			break;
		case 2:
			c = a - b;
			System.out.println("Subtraction : " + c);
			break;
		case 3:
			c = a * b;
			System.out.println("Multiplication : " + c);
			break;
		case 4:
			c = a / b;
			System.out.println("Division : " + c);
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
	}

}
