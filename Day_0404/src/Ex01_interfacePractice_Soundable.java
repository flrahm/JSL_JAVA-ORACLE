
public class Ex01_interfacePractice_Soundable {

	public static void main(String[] args) {

		Dog dog = new Dog();	
		Cat cat = new Cat();
		SoundableExam.printSound(dog);
		SoundableExam.printSound(cat);
		
		System.out.println("----------------");
		
		// �� ���� ���
		Soundable sound = new Dog();
		SoundableExam.printSound(sound);
		sound = new Cat();
		SoundableExam.printSound(sound);
		
		
		System.out.println("----------------");
		
		/////////�͸�����ü
		Soundable sound2 = new Soundable() {		
			@Override
			public String sound() {
				// TODO Auto-generated method stub
				return "�͸�����ü : haha";
			}
		};
		SoundableExam.printSound(sound2);
		//////////////////////// ��ȸ������ ����Ҷ� ����. �޽��������� ����� ��
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