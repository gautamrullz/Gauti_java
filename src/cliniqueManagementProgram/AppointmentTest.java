package cliniqueManagementProgram;

import java.io.FileReader;
import java.io.FileWriter;
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
	
	 
	public void addDoctor() throws Exception{
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/txt/cliniqueDoc.json");
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
		JSONArray docList=(JSONArray)docspecialization.get(specialization);
		Doctor d=new Doctor(docList.size()+1, name, specialization, timeing);
		docList.add(d.toString());
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/txt/cliniqueDoc.json");
		fw.write(docDtl.toString());
		fw.close();
		
		FileReader fr1=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/txt/clinique.json");
		//JSONParser par= new JSONParser();
		Object obj1=par.parse(fr1);
		fr1.close();
		JSONObject cli=(JSONObject)obj1;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=new JSONArray();
		docId.put((docId.size()+1)+"",patList);
		FileWriter fw1=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/txt/clinique.json");
		fw1.write(cli.toString());
		fw1.close();
		
	}
	
	public Patients addPatient(JSONArray patList) throws Exception{
		System.out.println("enter your name:");
		String name=scn.next();
		System.out.println("mobNo");
		Long mobNo =scn.nextLong();
		System.out.println("Age");
		int age=scn.nextInt();
		Patients p=new Patients(patList.size()+1,name,mobNo,age);
		patList.add(p.toString());
		return p;
	}
	
	public void getAppointment() throws Exception{
		System.out.println("enter the Specialization for searching the doctor");
		String specialization =scn.next();
		System.out.println("enter doctor Id");
		int id=scn.nextInt();
		String strId=id+"";
		FileReader fr=new FileReader("/home/bridgeit/Desktop/Gauti_java/Start/txt/clinique.json");
		JSONParser par= new JSONParser();
		Object obj=par.parse(fr);
		fr.close();
		JSONObject cli=(JSONObject)obj;
		JSONObject docSpc=(JSONObject) cli.get("clinique");
		JSONObject docId=(JSONObject) docSpc.get(specialization);
		JSONArray patList=(JSONArray)docId.get(strId);
		System.out.println(docId);
		addPatient(patList);
		System.out.println(docId);
		FileWriter fw=new FileWriter("/home/bridgeit/Desktop/Gauti_java/Start/txt/clinique.json");
		fw.write(cli.toString());
		fw.close();
		
		
	}
}
