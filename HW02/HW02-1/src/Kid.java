/**
 * This models the Kids
 * Here you have a constructor to set up the kid
 * @author zgoold17
 *
 */


public class Kid extends Person{

	//VARIABLES
	String favoriteCandy;
	
	
	//CONSTRUCTORS
	public Kid(){
		favoriteCandy = null;
	}
	public Kid(String candy, String name, int age, String phone){
		favoriteCandy = candy;
		setName(name);
		setAge(age);
		setPhoneNumber(phone);
	}
	
	//SET FUNCTIONS
	public void setCandy(String Candy){
		favoriteCandy = Candy;
	}
	
	//GET FUNCTIONS
	public String getCandy(){
		return favoriteCandy;
	}
	
}
