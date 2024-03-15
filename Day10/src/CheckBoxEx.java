import java.awt.*;
public class CheckBoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Test");
		Panel p = new Panel();
		
		
		CheckboxGroup ckGroup = new CheckboxGroup();
		Checkbox ck1  = new Checkbox("1번", ckGroup, true);
		Checkbox ck2 = new Checkbox("2번", ckGroup, false);
		Checkbox ck3 = new Checkbox("3번", ckGroup, false);
		
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		f.add(p);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
