
public class Ex01_interfacePractice_Soundable {

	public static void main(String[] args) {

		Dog dog = new Dog();	
		Cat cat = new Cat();
		SoundableExam.printSound(dog);
		SoundableExam.printSound(cat);
		
		System.out.println("----------------");
		
		// 더 좋은 방법
		Soundable sound = new Dog();
		SoundableExam.printSound(sound);
		sound = new Cat();
		SoundableExam.printSound(sound);
		
		
		System.out.println("----------------");
		
		/////////익명구현개체
		Soundable sound2 = new Soundable() {		
			@Override
			public String sound() {
				// TODO Auto-generated method stub
				return "익명구현개체 : haha";
			}
		};
		SoundableExam.printSound(sound2);
		//////////////////////// 일회용으로 사용할때 좋음. 메시지같은거 출력할 때
		//printSound(sound2);
		
	}

}



interface Soundable {	
	String sound();	

}

class Cat implements Soundable{
	
	int a = 5;
	
	@Override
	public String sound() {
			
		return "Cat : mew mew ";
	}
	
}


class Dog implements Soundable{
	public String sound() {
		
		return "Dog : bowwow";
	}
	
}
class SoundableExam{
	
	 static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	 
	 
}