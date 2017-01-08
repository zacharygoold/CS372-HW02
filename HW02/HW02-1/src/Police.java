import java.util.Scanner;

/**
 * This models the Police
 * Police are employees
 * They have a specific role
 * Along with get and set functions for getting paid and ID
 * @author zgoold17
 *
 */

public class Police extends Person implements Employee {
	//variables
	private Role role = Role.Patrol; //default
	
	public enum Role{
		Patrol, Sargent, Captain, Chief;
	}

	
	//set function
	public void setRole(Role r){
		this.role = r;
	}
	
	public Role getRole(){
		return role;
	}
	
	public Police(){
	}
	
	public Police (Role role, String name, int age, String phoneNumber){
		this.role = role;
		setName(name);
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
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




/*
	//VARIABLES
	String policeRole;
	boolean isPolice;
	
	//CONSTRUCTORS
	public Police(){
		policeRole = null;
		isPolice = true;
	}
	public Police(String role){
		policeRole = role;
		isPolice = true;
	}
	
	//SET FUNCTIONS
	public void setRole(String role){
		policeRole = role;
	}
	
	//GET FUNCTIONS
	public String getRole(){
		return policeRole;
	}
*/

