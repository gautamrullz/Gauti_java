package cliniqueManagementProgramme;

public class Doctor {
	private int doctorId;
	private String name;
	private String Specialization;
	private String timeing;
	int noOfPatient=0;
	
	public Doctor(int id,String name,String Specialization, String timeing) {
		this.doctorId=id;
		this.name=name;
		this.Specialization=Specialization;
		this.timeing=timeing;
	}
	public Doctor(){
		
	}
	public String getName() {
		return name;
	}
	
	public String getSpecialization() {
		return Specialization;
	}

	public int getId() {
		return doctorId;
	}

	public String getTimeing1() {
		return timeing;
	}
	@Override
	public String toString() {
		
		return "doctorId :"+doctorId+" name :"+name+
				" Specialization :"+Specialization+" timeing :"+timeing;
	}
	public int patientInQueue(){
		
		return ++noOfPatient;
	}
	
	
}
