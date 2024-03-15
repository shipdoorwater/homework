class ATMTwo implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);

			}
		}
	}

//	} 
	public void withDraw(long howMuch) {
		synchronized (this) {
			if (getDepositeMoney() > 0) {
				try {
					notify();
					depositeMoney -= howMuch;
					System.out.print(Thread.currentThread().getName() + " , ");
					System.out.printf("%d %n", getDepositeMoney());
					wait();

				} catch (InterruptedException ie) {

				}

			} else {
				System.out.print(Thread.currentThread().getName() + " , ");
				System.out.println("End.");
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class WaitNotifyEx {
	public static void main(String[] args) {
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();

	}
}
