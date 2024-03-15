import java.awt.*;
import java.awt.event.*;

class Exit extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}

public class ActionEvetnEx extends Frame implements ActionListener{
	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEvetnEx() {
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
		
		
		// WindowAdaptor 외부클래스를 새로 객체 만들어서 사용
		addWindowListener(new Exit());
		
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
	
	public static void main(String[] args) {
		new ActionEvetnEx();
	}

}

