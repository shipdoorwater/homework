package Homework;

import java.util.Scanner;
import java.util.Arrays;

public class MemoryExam {

	public static void main(String[] args) {

		MyStack ms = new MyStack();
		MyQueue mq = new MyQueue();
		Memory m;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1.Stack 2.Queue 3.exit");
			int num = sc.nextInt();

			if (num == 1) {
				m = ms;
			} else if (num == 2) {
				m = mq;
			} else {
				m = mq;
				System.exit(0);
			}
			
			do {
				System.out.print("1.push 2.pop 3.back");

				int n = sc.nextInt();

				if (n == 1) {
					m.push(sc.nextInt());

				} else if (n == 2) {
					System.out.println(m.pop());
					
				} else break;
				
			} while(true);
			

		} while (true);
	}

}