package p01_map.tree.Sawon;

public class Sawon implements Comparable<Sawon> {

	private int sno;
	private String name;
	private int socre;
	
	public Sawon() {}
	public Sawon(int sno, String name, int socre) {
		this.sno = sno;
		this.name = name;
		this.socre = socre;
	}

	
	@Override	// TreeSet 을 위한 compareTo 메소드 오버라이딩
	public int compareTo(Sawon o) {	// 오름차순
		
		// 오름차순
		if(sno < o.getSno())
			return -1;
		else if (sno == o.sno)
			return 0;
		else
			return 1;
		
	}


	@Override
	public String toString() {
		return sno + "\t" + name + "\t" + socre;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocre() {
		return socre;
	}

	public void setSocre(int socre) {
		this.socre = socre;
	}
	
	
}
