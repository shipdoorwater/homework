import java.util.*;

public class Queue {
	int queue[] = new int[5];
	int front;
	int top;

	Queue() {
		front = 0;
		top = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.start();
	}
	
	void start() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.Enqueue / 2. Dequeue");
			switch (sc.nextInt()) {
			case 1:
				enqueue(sc.nextInt());
				break;
			case 2:
				dequeue();
				break;
			}
			System.out.println(Arrays.toString(queue)); 
		}
	}

	void enqueue(int input) {

		shift();
		queue[top] = input;
		top++;

	}

	void dequeue() {

		queue[front] = 0;
		front++;
	}

	void shift() {
		int tmp = 0;
		if (top == 5 && front != 0) {
			for (int i = front; i < 5; i++) 
				queue[tmp++] = queue[i];
			for (int i = tmp; i<5; i++) {
				queue[i] = 0;
				top --;
			}	
		}
		front = 0;
	}

}
