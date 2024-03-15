
public class MyQueue extends Memory {

	private int front;

	@Override
	public void push(int data) {
		if (top == 4 && front == 0) {
			System.out.println("배열이 꽉 찼습니다");
		} else if (top == 4 && front != 0) {
			int num = 0;
			for (int i = front; i <= top; i++) {
				arr[num] = arr[i];
				num++;
			}
			super.push(data);
		} else {
			super.push(data);
		}

	}

	@Override
	public int pop() {

		return arr[front++];
	}
}
