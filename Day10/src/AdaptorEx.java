import java.awt.*;
import java.awt.event.*;

public class AdaptorEx extends Frame implements ActionListener, WindowListener{
	Panel p;
	Button input, exit;
	TextArea ta;
	
	
	public AdaptorEx() {
		super("ActionEvent Test");
		p = new Panel();
		input = new Button("Input");
		exit = new Button("Exit");
		ta = new TextArea("");
		
		// 이벤트소스와 이벤트 핸들러를 연결한다
		input.addActionListener(this);
		exit.addActionListener(this);
		
		p.add(input);
		p.add(exit);
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300,300,300,200);
		setVisible(true);
		
		
		// 윈도우 x(종료) 버튼 클릭 이벤트 추가
		Label exit2 = new Label("프로그램 종료") ;
		
		add(exit2);
		
		addWindowListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name;
		name = ae.getActionCommand();
		
		if (name.equals("Input"))
			ta.append("Input \n");
		
		else if (name.equals("Exit")) {
			ta.append("Exit \n");
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
			}
			System.exit(0);
		}
		
		else {	
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new AdaptorEx();
	}
	
}
