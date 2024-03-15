import java.util.Arrays;
import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국" };
		
		Stack<String> stack = new Stack<String>();
		for (String n : groupA) {
			stack.push(n);
			System.out.println(stack);
		}
			
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
}
