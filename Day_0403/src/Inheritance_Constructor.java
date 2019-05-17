class G_parent{
	
	public G_parent() {
		
		System.out.println("G_parent 생성자 호출");
	}
}

class G_child extends G_parent{	// 자식객체를 생성하면 부모객체도 자동으로 생성되고 생성자역시 호출됨
	
	
	public G_child(){
		System.out.println("G_child 생성자 호출");
	}
}


public class Inheritance_Constructor {

	public static void main(String[] args) {
		
		//G_parent gp1 = new G_parent();
		G_child gc1 = new G_child();
		//G_parent parent = new G_child();

	}

}
