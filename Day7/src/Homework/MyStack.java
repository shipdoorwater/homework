package Homework;

public class MyStack extends Memory{
	
	@Override
	public void push(int data) {
		if (top == 5) {
			System.out.println("배열이 꽉 찼습니다");
		} else {
			super.push(data);
		}
		
	}

	@Override
	public int pop() {
		
		if (top==0) {
			return 0;
		} else {
			return arr[--top];
		}		
	}
}