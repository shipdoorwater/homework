import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class KeyClass extends KeyAdapter {
	TextField input;
	TextArea output;
	
	public KeyClass(TextField input, TextArea output) {
		this.input = input;
		this.output = output;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			output.append(input.getText() + "\n");
			input.setText("");	
		}
	}
}

class WindowClass extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);;
	}
}

public class AdaptoExSelf2 extends Frame implements ActionListener{
	
	Button clear, exit;
	Panel p1,p2,p3;
	TextField input;
	TextArea output;
	
	public AdaptoExSelf2() {
		
		super("Adapter Exam");
		
		clear = new Button("Clear");
		exit = new Button("Exit");

		p1= new Panel();
		p2= new Panel();
		p3= new Panel();
		
		input = new TextField(35);
		output = new TextArea(15,35);
		
		p1.add(input);
		p2.add(output);
		p3.add(clear);
		p3.add(exit	);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		clear.addActionListener(this);
		exit.addActionListener(this);
		
		input.addKeyListener(new KeyClass(input, output));
		
		addWindowListener(new WindowClass());
		
		setBounds(300,200,300,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		
		if (name.equals("Clear")) {
			input.setText("");
			output.setText("");
			input.requestFocus();
		};
		
		if (name.equals("Exit"))
			System.exit(0);
	}

	public static void main(String[] args) {
		new AdaptoExSelf2();
	}
}
