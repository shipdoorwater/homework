package Homework;


public class MyQueue extends Memory {

	private int front;

	@Override
	public void push(int data) {
		if (top == 5 && front == 0) {
			System.out.println("배열이 꽉 찼습니다");
		} else if (top == 5 && front != 0) {
			int num = 0;
			for (int i = front; i < top; i++) {
				arr[num] = arr[i];
				num++;
			}
			top = top - front;
			for (int j = 4 ; j>top-1 ; j--) {
				arr[j] =0;
			}
			front = 0;
			super.push(data);
		} else {
			super.push(data);
		}

	}

	@Override
	public int pop() {

		if (front == 5) {
			return 0;
		}
		return arr[front++];
		
	}
}
