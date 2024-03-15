
public class IllegalStateExceptionTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.startEngine();

		// 이미 시작된 엔진을 다시 시작하려고 시도합니다.
		car.startEngine(); // 여기서 IllegalStateException이 발생합니다.

		car.stopEngine();
	}
}

class Car {
	private boolean engineStarted;

	public void startEngine() {
		if (engineStarted) {
			throw new IllegalStateException("엔진이 이미 시작되었습니다.");
		}
		System.out.println("엔진을 시작합니다.");
		engineStarted = true;
	}

	public void stopEngine() {
		if (!engineStarted) {
			throw new IllegalStateException("엔진이 이미 정지되었습니다.");
		}
		System.out.println("엔진을 정지합니다.");
		engineStarted = false;
	}
}
