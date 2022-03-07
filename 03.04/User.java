package Test0304;

public class User {
	
	private String name;
	private String address;
	private String cellularNumber;
	private boolean male;

	public User() {
	}
	public User(String name, String address, String cellularNumber, boolean male) {
		this.name = name;
		this.address = address;
		this.cellularNumber = cellularNumber;
		this.male = male;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCellularNumber() {
		return cellularNumber;
	}
	public void setCellularNumber(String cellularNumber) {
		this.cellularNumber = cellularNumber;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	
	public String toString() {
		return ":: 이름 : "+getName()+", 핸드폰 : "+getCellularNumber()+", 성별 : "+(male ? "남":"여") + ", 주소 : "+getAddress();
	}

}//end of class
