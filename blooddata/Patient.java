package BloodData;

public class Patient {
	private Integer idNum;
	private int age;
	private BloodData data;
	
	Patient() {
		idNum = "0";
		age = 0;
		data = new BloodData();
	}
	
	Patient(String id, int age, String bloodType, String rhFactor) {
		this.idNum = id;
		this.age = age;
		this.data = new BloodData(bloodType, rhFactor);
	}
	
	public String getIdNum() {
		return this.idNum;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public BloodData getBloodData() {
		return this.data;
	}
}