import java.awt.*;
import java.awt.event.*;

class InnerEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}

}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent a) {
		System.out.println("ActionEvent occured!!!");
	}
}
