package p01_map.member;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// member ��ü�� �����ϸ� �ߺ����� �ʵ��� ����
// �Է� : 7,ȫ�浿,95 (��ȣ �̸� ����)

public class MemberTest {

	public static void main(String[] args) {
	
		Map<Member,Integer> mMap = new HashMap<Member,Integer>();

		
		Scanner scan = new Scanner(System.in);

		System.out.println("��ȣ �̸� ������ �Է��ϼ���");
		while(true) {
			
			String[] str = scan.next().split(",");	// �Է°��� "," �� �ɰ�
			
			if(str.length == 3) {	// 3���� ����� �ԷµǾ������
				int bun = Integer.parseInt(str[0]);	// ù��°���� ��ȣ��
				if(bun == 0) {	// ��ȣ�� 0�̸� ����
					System.out.println("�Է��� ����Ǿ����ϴ�");
					break;
				}
				String name = str[1];	// �ι�°���� �̸�����
				int score = Integer.parseInt(str[2]);	// ����° ���� ��ȣ��
				Member mem = new Member(bun,name);	// �Է°��� ������ �ӽ÷� ��� ��ü�� ����
				if(mMap.containsKey(mem)==false) {	// ���� �ߺ��� �ƴϸ�
					mMap.put(mem,score);	// �� �߰�
				}
			}
			else
				System.out.println("�߸��� �Է��Դϴ�");
		}
		
		scan.close();
		
		System.out.println();

		
		// ��� way 1 : entry set �̿�
		System.out.println("��ȣ\t�̸�\t����");
		
		Set<Map.Entry<Member, Integer>> mSet = mMap.entrySet();	 // ��Ʈ�� ��
		Iterator<Map.Entry<Member, Integer>> mIter = mSet.iterator();	// ���ͷ�����

		while(mIter.hasNext()) {
			Map.Entry<Member, Integer> entry = mIter.next();	// ��Ʈ���� �о ����
			Member mem = entry.getKey();	// ������� ���� Ű���� ����
			int score = entry.getValue();	// ��Ʈ�� ������ ���� ������� ����
			
			System.out.println(mem.getNum() +"\t"+mem.getName()+"\t"+score);	// ���
			
		}
		// ��� way 2	: key set �̿�
		System.out.println("----------------------------------");
		
		Set<Member> mSet2 = mMap.keySet();	// Ű��
		Iterator<Member> mIter2 = mSet2.iterator();	// ���ͷ�����
		while(mIter2.hasNext()) {	
			Member mem = mIter2.next();
			int score = mMap.get(mem);
			
			System.out.println(mem.getNum() +"\t"+mem.getName()+"\t"+score);
		}
	}

}
