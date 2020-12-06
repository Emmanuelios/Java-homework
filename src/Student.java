
public class Student {
	
	private String name;
	private String personalid;
	private int adyear;
	private String countryoforigin;
	private String currentaddress;
	private String accountnumber;
	private String Phonenumber;
	
	public Student(String name, String personalid, int adyear, String countryoforigin, String currentaddress, String accountnumber, String Phonenumber) {
		super();
		this.name = name;
		this.personalid = personalid;
		this.adyear = adyear;
		this.countryoforigin = countryoforigin;
		this.currentaddress = currentaddress;
		this.accountnumber = accountnumber;
		this.Phonenumber= Phonenumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalid() {
		return personalid;
	}
	public void setPersonalid(String personalid) {
		this.personalid = personalid;
	}
	public int getAdyear() {
		return adyear;
	}
	public void setAdyear(int adyear) {
		this.adyear = adyear;
	}
	public String getCountryoforigin() {
		return countryoforigin;
	}
	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", personalid=" + personalid + ", adyear=" + adyear + ", countryoforigin="
				+ countryoforigin + ", currentaddress=" + currentaddress + ", accountnumber=" + accountnumber
				+ ", Phonenumber=" + Phonenumber + "]";
	}
	
	

}
