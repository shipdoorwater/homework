class Animal {
    public void eat() {
        System.out.println("동물이 먹는다.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍!");
    }
}
public class ClassCastExeptionTest {
	 public static void main(String[] args) {
	        Animal animal = new Animal();

	        try {
	            // Animal 클래스를 Dog 클래스로 형변환하려고 시도합니다.
	            Dog dog = (Dog) animal; // 여기서 ClassCastException이 발생합니다.
	            dog.bark();
	        } catch (ClassCastException e) {
	            System.out.println("ClassCastException이 발생했습니다: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
}
