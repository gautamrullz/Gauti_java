package cliniqueManagementProgram;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class AppointmentTest { 
	
	JSONObject cli;
	JSONObject docSpc;
	JSONObject docId;
	Scanner scn=new Scanner(System.in);
	Queue<Patients> q= new LinkedList<>();
	int dinc=0;
	
	@SuppressWarnings("unchecked")
	public void addDoctor() throws Exception 
	{
		
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Test/src/"
													+ "cliniqueManagementProgram/testDoctor.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		JSONObject docDtl=(JSONObject)obj;
		
		JSONObject docspecialization =(JSONObject)docDtl.get("doctersDetail");
		System.out.println("enter your name:");
		String name=scn.next();
		System.out.println("enter Specialization:");
		String specialization=scn.next();
		System.out.println("enter your timeing AM/PM:");
		String timeing =scn.next();
		//adding doctor to testDoctor.json

		JSONArray docList=(JSONArray)docspecialization.get(specialization);
		Doctor d=new Doctor(docList.size()+1, name, specialization, timeing);
		JSONObject jsonItr=new JSONObject();
		jsonItr.put("doctorId",d.getId()+"" );
		jsonItr.put("name", d.getName());
		jsonItr.put("specialization", d.getSpecialization());
		jsonItr.put("timeing", d.getTimeing());
		docList.add(jsonItr);
		
		//writing the data to testDoctor.json
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Test/src/"
													+ "cliniqueManagementProgram/testDoctor.json");
		fw.write(docDtl.toString());
		fw.close();
		//testDocter.json got closed hear
		
		//adding doctor to testPatient.json
		FileReader fr1=new FileReader("/home/bridgeit/Desktop/Gauti_java/Test/src/"
													+ "cliniqueManagementProgram/testPatient.json");
		Object obj1=par.parse(fr1);
		fr1.close();
		JSONObject cli=(JSONObject)obj1;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=new JSONArray();
		docId.put((d.getId())+"",patList);
		
		//writing the data to testPatient.json
		FileWriter fw1=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Test/src/"
											+ "cliniqueManagementProgram/testPatient.json");
		fw1.write(cli.toString());
		fw1.close();
		//testPatient.json got closed hear
		
		
		//adding doctor ID to the patient in Queue
		FileReader fr2=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
												+ "cliniqueManagementProgram/queue.json");
		Object obj2=par.parse(fr2);
		fr2.close();
		cli=(JSONObject)obj2;
		docSpc=(JSONObject) cli.get("queue");
		docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList1=new JSONArray();
		docId.put((d.getId())+"",patList1);
		
		
		//writing the data to queue.json
		FileWriter fw2=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/src/"
												+ "cliniqueManagementProgram/queue.json");
		fw2.write(cli.toString());
		fw2.close();
				
	}
	
	@SuppressWarnings("unchecked")
	public Patients addPatient(JSONArray patList) throws Exception{
		
		
		System.out.println("enter your name:");
		String name=scn.next();
		System.out.println("mobNo");
		Long mobNo =scn.nextLong();
		System.out.println("Age");
		int age=scn.nextInt();
		Patients p=new Patients(patList.size()+1,name,mobNo,age);
		JSONObject patItr=new JSONObject();
		patItr.put("PatientId",p.getPatientId()+"");
		patItr.put("name", p.getName());
		patItr.put("mobno", p.getMobNo()+"");
		patItr.put("age", p.getAge()+"");
		patList.add(patItr);
		return p;
	}
	
	@SuppressWarnings("unchecked")
	public void getAppointment() throws Exception
	{
		System.out.println("enter the Specialization for searching the doctor");
		String specialization =scn.next();
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Test/src/"
														+ "cliniqueTest/testDoctor.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		//filereader closed
		fr.close();
		
		JSONObject docDtl=(JSONObject)obj;
		JSONObject docspecialization =(JSONObject)docDtl.get("doctersDetail");
		JSONArray docList=(JSONArray)docspecialization.get(specialization);
		Iterator<JSONObject> iterator = docList.listIterator();
		
		while (iterator.hasNext()) 
		{
			JSONObject jobj=iterator.next();
			System.out.println("Doctor ID:"+jobj.get("doctorId"));
			System.out.println("Doctor Name:"+jobj.get("name"));
			
		}
		
		System.out.println("enter doctor Id");
		int id=scn.nextInt();
		String strId=id+"";
		FileReader fr1=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
											+ "cliniqueManagementProgram/testPatient.json");
		Object obj1=par.parse(fr1);
		//fileReader closed
		fr1.close();
		
		JSONObject cli=(JSONObject)obj1;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=(JSONArray)docId.get(strId);
		System.out.println(docId);
		addPatient(patList);
		System.out.println(docId);
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/src/"
										+ "cliniqueManagementProgram/testPatient.json");
		fw.write(cli.toString());
		fw.close();
	}
	
	//geting Doctor Detail
	@SuppressWarnings("unchecked")
	public boolean getDocterDetail() throws Exception
	{
		System.out.println("enter Specialization of doctor to search");
		String specialization=scn.next();
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
										+ "cliniqueManagementProgram/testDoctor.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		fr.close();
		JSONObject cli=(JSONObject)obj;
		JSONObject docSpc=(JSONObject) cli.get("doctersDetail");
		JSONArray patList=(JSONArray)docSpc.get(specialization);
		Iterator<JSONObject> iterator = patList.listIterator();
		System.out.println("1.search by ID");
		System.out.println("2.search by name");
		System.out.println("3.search by timeing");
		int ch=scn.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter the ID of Doctor");
				String docId=scn.next();
				String strId=docId+"";
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
					
					if(strId.equals(jobj.get("doctorId")))
					{
						System.out.println("doctorId:"+jobj.get("doctorId"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("specialization:"+jobj.get("specialization"));
						System.out.println("timeing:"+jobj.get("timeing"));
						return true;
					}
				}
				break;
				
			case 2:
				System.out.println("enter the name of Doctor");
				String docName=scn.next();
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
				
					if(docName.equalsIgnoreCase((String) jobj.get("name")))
					{
						System.out.println("doctorId:"+jobj.get("doctorId"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("specialization:"+jobj.get("specialization"));
						System.out.println("timeing:"+jobj.get("timeing"));
						return true;
					}
				}
				break;
				
			case 3:
				System.out.println("enter timeing you want AM/PM");
				String docTimeing=scn.next();
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
				
					if(docTimeing.equalsIgnoreCase((String) jobj.get("timeing")))
					{
						System.out.println("doctorId:"+jobj.get("doctorId"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("specialization:"+jobj.get("specialization"));
						System.out.println("timeing:"+jobj.get("timeing"));
						return true;
					}
				}
				break;
				
			default:
				System.out.println("Sorry wrong input");
        }
		return false;
	}
	
	//geting Patient Detail
	@SuppressWarnings("unchecked")
	public boolean getPatientDetail() throws Exception

	{
		System.out.println("enter Specialization of doctor to search");
		String specialization=scn.next();
		System.out.println("enter doctor Id");
		int id=scn.nextInt();
		String strId=id+"";
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
										+ "cliniqueManagementProgram/testPatient.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		fr.close();
		JSONObject cli=(JSONObject)obj;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=(JSONArray)docId.get(strId);
		Iterator<JSONObject> iterator = patList.listIterator();
		System.out.println("Search for patient");
		System.out.println("1.search by ID");
		System.out.println("2.search by name");
		System.out.println("3.search by mobile");
		System.out.println("4.search by age");
		int ch=scn.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter the ID of Patient");
				String patId=scn.next();
				//String strPatId=patId+"";
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
					
					if(patId.equals(jobj.get("PatientId")))
					{
						System.out.println("PatientId:"+jobj.get("PatientId"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("mobno:"+jobj.get("mobno"));
						System.out.println("age:"+jobj.get("age"));
						return true;
					}
				}
				break;
				
			case 2:
				System.out.println("enter the name of Patient");
				String patName=scn.next();
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
				
					if(patName.equals(jobj.get("name")))
					{
						System.out.println("patientId:"+jobj.get("PatientID"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("mobno:"+jobj.get("mobno"));
						System.out.println("age:"+jobj.get("age"));
						return true;
					}
				}
				break;
				
			case 3:
				System.out.println("enter Mobile No. of patient");
				long mobNo=scn.nextLong();
				String mobStr=mobNo+"";
				
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
				
					if(mobStr.equals(jobj.get("mobno")))
					{
						System.out.println("patientId:"+jobj.get("PatientID"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("mobno:"+jobj.get("mobno"));
						System.out.println("age:"+jobj.get("age"));
						return true;
					}
				}
				break;
				
			case 4:
				System.out.println("enter age of Patient");
				int age=scn.nextInt();
				String ageStr=age+"";
				while (iterator.hasNext()) 
				{
					JSONObject jobj=iterator.next();
				
					if(ageStr.equals(jobj.get("age")))
					{
						System.out.println("patientId:"+jobj.get("PatientID"));
						System.out.println("name:"+jobj.get("name"));
						System.out.println("mobno:"+jobj.get("mobno"));
						System.out.println("age:"+jobj.get("age"));
						return true;
					}
				}
				break;
				
			default:
				System.out.println("Sorry wrong input");
				return false;
        }
		return false;
	}
	@SuppressWarnings("unchecked")
	public void checkAvability() throws Exception
	{
		System.out.println("enter the Specialization for searching the doctor");
		String specialization =scn.next();
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
										+ "cliniqueManagementProgram/testDoctor.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		fr.close();
		//file reader fr closed
		
		JSONObject docDtl=(JSONObject)obj;
		JSONObject docspecialization =(JSONObject)docDtl.get("doctersDetail");
		JSONArray docList=(JSONArray)docspecialization.get(specialization);
		Iterator<JSONObject> iterator = docList.listIterator();
		
		while (iterator.hasNext()) 
		{
			JSONObject jobj=iterator.next();
			System.out.println("Doctor ID:"+jobj.get("doctorId"));
			System.out.println("Doctor Name:"+jobj.get("name"));
			System.out.println("Doctor timeing:"+jobj.get("timeing"));
		}
		
		System.out.println("enter doctor Id");
		int id=scn.nextInt();
		String strId=id+"";
		
		FileReader fr1=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
										+ "cliniqueManagementProgram/testPatient.json");
		Object obj1=par.parse(fr1);
		fr1.close();
		//file reader fr1 closed
		
		JSONObject cli=(JSONObject)obj1;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=(JSONArray)docId.get(strId);
		if(patList.size()>=5)
		{
			System.out.println("!!!!!....Not available for today.....!!!!!");
		}
		else
		{
			System.out.println("!!!!!....Avaliable.....!!!!!");
		}
		
		System.out.println(patList.size()+" :Allready in queue");
		System.out.println("enter 'yes' if you want to get an appointment else 'no'");
		String option=scn.next();
		
		if(option.equalsIgnoreCase("yes"))
		{
			if(patList.size()<5)
			{
				getAppointment();
			}
			else
			{	
				beInQueue(specialization,strId);
			}
			
		}
		else
		{
			System.out.println("thanks for visiting us....!!!!");
			return;
		}
	}
	
	public void beInQueue(String specialization,String strId) throws Exception
	{
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/src/"
												+ "cliniqueManagementProgram/queue.json");
		JSONParser par= new JSONParser();
		Object obj1=par.parse(fr);
		//fileReader closed
		fr.close();
		
		JSONObject cli=(JSONObject)obj1;
		JSONObject docSpc=(JSONObject) cli.get("queue");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=(JSONArray)docId.get(strId);
		addPatient(patList);
		System.out.println(docId);
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/src/"
												+ "cliniqueManagementProgram/queue.json");
		fw.write(cli.toString());
		fw.close();
	}
}
