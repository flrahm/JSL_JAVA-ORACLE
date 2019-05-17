package zipcode.vo;

public class ZipcodeVO {

	private String no;
	private String zipcode;
	private String siso;
	private String gugun;
	private String dong;
	private String bunji;
	
	
	
	
	@Override
	public String toString() {
		return no + "\t" + zipcode + "\t" + siso + "\t" + gugun + "\t" + dong + "\t" + bunji;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSiso() {
		return siso;
	}
	public void setSiso(String siso) {
		this.siso = siso;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getBunji() {
		return bunji;
	}
	public void setBunji(String bunji) {
		this.bunji = bunji;
	}
	
	
}
