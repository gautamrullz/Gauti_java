package cliniqueManagementProgramme;

public class Patients {
	private int patientId;
	private String name;
	private long mobNo;
	int age;
	
	public Patients(int patientId,String name,long mobNo,int age) {
		this.patientId=patientId;
		this.name=name;
		this.mobNo=mobNo;
		this.age=age;
	}
	public int getPatientId() {
		 return patientId;
	}
	public String getName() {
		return name;
	}
	public long getMobNo() {
		return mobNo;
	}
	@Override
	public String toString() {
		return "PatientID :"+patientId+" name :"+name+" mobno :"+mobNo+" age :"+age;
	}
}
