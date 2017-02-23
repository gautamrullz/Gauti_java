package cliniqueManagementProgram;

public class Test {

	public static void main(String[] args) throws Exception {
		AppointmentTest ap=new AppointmentTest();
		//ap.getAppointment();
		//ap.addDoctor();
		/*
		if(!ap.getDocterDetail()){
			System.out.println("!!!!!!<<<no such Doctor available>>>!!!!!!");
		}
		*/
		
		if(!ap.getPatientDetail()){
			System.out.println("!!!!!!<<<no such Patient available>>>!!!!!!");
		}
		//ap.checkAvability();
	}
}
