class G_parent{
	
	public G_parent() {
		
		System.out.println("G_parent ������ ȣ��");
	}
}

class G_child extends G_parent{	// �ڽİ�ü�� �����ϸ� �θ�ü�� �ڵ����� �����ǰ� �����ڿ��� ȣ���
	
	
	public G_child(){
		System.out.println("G_child ������ ȣ��");
	}
}


public class Inheritance_Constructor {

	public static void main(String[] args) {
		
		//G_parent gp1 = new G_parent();
		G_child gc1 = new G_child();
		//G_parent parent = new G_child();

	}

}
