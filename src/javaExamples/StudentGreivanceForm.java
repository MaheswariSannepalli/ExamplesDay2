package javaExamples;

import java.io.FileWriter;
import java.io.IOException;

class SaveDetails{
	//After saving grievance of a student we are saving it in file . No need to have a separate memory space for each user , so declare it as static
	static String department;
	static int year;
	static String greivance;
	//name should be kept private for preventing access by another class
	private static String name;
	
	//constructor overloading
	SaveDetails(String department,int year,String greivance)
	{
		SaveDetails.department = department;
		SaveDetails.year = year;
		SaveDetails.greivance = greivance;
		SaveToFile();
	}
	SaveDetails(String department,int year,String greivance,String name)
	{
		SaveDetails.department = department;
		SaveDetails.year = year;
		SaveDetails.greivance = greivance; 
		SaveDetails.name = name;
		SaveToFile();
	}
	
	private void SaveToFile()
	{
		//Using Exceptions
		try {  
	        FileWriter fwrite = new FileWriter("C:\\Users\\mahi0\\Documents\\StudentGreivances.txt",true);  
	        fwrite.write("\n name : "+name+" department : "+department+"year : "+year+" greivance : "+greivance);   
	        fwrite.close();  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred while saving your response");  
	        e.printStackTrace();  
	        }  
	}
}
public class StudentGreivanceForm {

	public static void main(String[] args)
	{
		SaveDetails user1 = new SaveDetails("CSE",3,"Important information is not being passed by class representative","Maheswari");
		SaveDetails user2 = new SaveDetails("ECE",2,"OOPL Staff is not regular");
	}
}
