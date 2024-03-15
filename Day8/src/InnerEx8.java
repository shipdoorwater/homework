import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {

	public static void main(String[] args) {
		
		Button b = new Button("Start");
		b.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent a) {
				System.out.println("ActionEvent occuerd!!!");
			}
		});
	}
}

class Student {
	private String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(Student stu) {
		this.name = stu.name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println("stu");
	}

	
	
}

class StudentMain {
	
	public static void main(String [] arg) {
	
		

				
		
	}
}