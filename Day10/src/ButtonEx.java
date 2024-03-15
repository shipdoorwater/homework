import java.awt.*;
public class ButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("ButtonTest");
		
		Panel p = new Panel();
		
		Button b1 = new Button();
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		
		TextField tf1 = new TextField("name input :",12);
		TextField tf2 = new TextField("password input :",12);
		
		tf1.selectAll();
		tf2.selectAll();
		
		tf2.setEchoChar('*');
		
		
		b1.setLabel("1");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(tf1);
		p.add(tf2);
		
		
		f.add(p);
		
		f.setLocation(300,300);
		f.setSize(300,300);
		f.setVisible(true);
		
		

	}

}
