class Tv {
	
	boolean power ;
	int channel ;
	
	void power() {
		power = !power;
	}
	void channelUP()  {
		channel++ ;
	}
	void channelDown() {
		channel--;
	}
}

class CaptionTv extends Tv {
	boolean caption;
	void dispCpation(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest  {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUP();
		System.out.println(ctv.channel);
		ctv.dispCpation("Hello");
		ctv.caption = true;
		ctv.dispCpation("Hello2");
	}
}