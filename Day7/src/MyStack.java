public class MyStack extends Memory{

	
	
	@Override
	public void push(int data) {
		if (top ==4) {
			System.out.println("배열이 꽉 찼습니다");
		}
		super.push(data);
	}

	@Override
	public int pop() {
		
		return arr[--top];
	}
}