///* 
// * Memory -> MyStack, MyQueue
// *  - PUSH는 같은 기능
// *  - POP은 다른 기능 : 추상 메소드로 작성
// *   
// * PUSH: 배열에 넣는 함수
// * POP: 배열에서 빼는 함수
// *   - MyStack은 FILO
// *   - MyQueue은 FIFO
// *
// * Main : 1번 스택 / 2번 큐
// */
//import java.util.*;
//
//abstract class Memory {
//	Scanner sc = new Scanner(System.in);
//	
//	int[] arr = new int[0];
//	int[] tmpArr;
//	
//	void push() {
//		System.out.println("Push하고 싶은 숫자?");
//		int i = sc.nextInt();   // push 숫자
//		
//		tmpArr = new int[arr.length+1]; 
//		
//		if (tmpArr.length == 1) {
//			arr = new int[1];
// 			arr[0] = i;
//		} else {
//			for (int j = 0; j < tmpArr.length -1; j++) {
//				 tmpArr[j] = arr[j];
//			}
//			arr = new int[tmpArr.length];
//			for (int k : tmpArr) {
//				arr[k] = tmpArr[k];
//			}
//			arr[arr.length - 1] = i;
//		}
//		
//	}
//	
//	abstract void pop();
//}
//
//class MyStack extends Memory {
//	
////	void push() {
////		super.push();
////	}
//	
//	void pop() {
//		int pop;
//		if (arr.length == 0) {
//			System.out.println("배열이 없습니다");
//		} else {
//			pop = arr[arr.length-1]; 
//			
//			tmpArr = arr;
//			arr = new int[arr.length -1];
//			for (int j : arr) {
//				arr[j] = tmpArr[j];
//			}  // arr 숫자 길이 줄인 뒤 붙여넣기		
//	
//		}
//		
//		
//	}
//}
//
//class Myqueue extends Memory {
//	
////	void push() {
////		super.push();
////	}
//	
//	void pop() {
//		int pop;
//		if (arr.length == 0) {
//			System.out.println("배열이 없습니다");
//		} else {
//			pop = arr[0] ;
//			
//			tmpArr = arr;
//			arr = new int[arr.length -1];
//			for (int j : arr) {
//				arr[j] = tmpArr[j+1];
//			}
//			
//			System.out.println("pop : " + pop);
//			System.out.println("배열 : " + arr);
//		}
//		
//		
//	}
//}
//
//public class Ver01 {
//
//	public static void main(String[] args) {
//		
//		MyStack myStack = new MyStack();
//		Myqueue myQueue = new Myqueue() ;
//				
//		System.out.println("1번: Stack / 2번. Queue");
//		Scanner sc = new Scanner(System.in);
//		
//		int choice = sc.nextInt();
//		boolean yOrN =true;
//		
//		switch (choice) {
//		case 1 : 
//			do {
//				System.out.println("1번: Push / 2번. Pop / 3번. 종료");
//				int i = sc.nextInt();
//				switch (i) {
//				case 1: myStack.push(); break;
//				case 2: myStack.pop(); break;
//				case 3: yOrN = !yOrN ;	 break;
//				}
//				
//			} while(yOrN) ;
//			
//		case 2 :
//			do {
//				System.out.println("1번: Push / 2번. Pop / 3번. 종료");
//				int i = sc.nextInt();
//				switch (i) {
//				case 1: myQueue.push(); break;
//				case 2: myQueue.pop();  break;
//				case 3: yOrN = !yOrN ;	 break;
//				}
//				
//			} while(yOrN) ;
//		}
//
//	}
//}
