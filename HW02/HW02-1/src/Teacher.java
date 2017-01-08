import java.util.Scanner;

/**
 * This models the TEachers
 * Teachers are employees
 * They have gradelevels and certifications
 * Along with get and set functions for getting paid and ID
 * @author zgoold17
 *
 */

public class Teacher extends Person implements Employee{
	
	//VARIABLES
	public int gradeLevel;
	public String certification;
	
	
	//CONSTRUCTORS
	public Teacher(){
		gradeLevel = 0;
		certification = null;
	}
	public Teacher(String cert, int grade, String name, int age, String phoneNumber){
		gradeLevel = grade;
		certification = cert;
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
		
	}
	
	//SET FUNCTIONS
	public void setGrade(int grade){
		gradeLevel = grade;
	}
	public void setCert(String cert){
		certification = cert;
	}
	
	//GET FUNCTIONS
	public String getCert(){
		return certification;
	}
	public int getGrade(){
		return gradeLevel;
	}
	
	public double getPaid(){
		double pay = 65000;
		return pay;
	}
	public void getID(){
		System.out.printf("Enter your ID: ");
		Scanner input = new Scanner(System.in);
		int ID = input.nextInt();
		System.out.printf("Yout ID is %d: ", input);
	}

}
