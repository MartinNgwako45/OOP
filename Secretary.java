

public class Secretary {


// Attributes
String secName;
String secSurname;
int secAge;
String secPhoneNumber;
String secAddress;

// Constructor
public Secretary(String sn, String add, int a, String pn, String n){

  this.secName= n;
  this.secPhoneNumber = pn;
  this.secSurname= sn;
  this.secAge = a;
  this.secAddress = add;
		
}

public String getName() {
	return secName;
	
}

public String getSurname() {
	return secSurname;
}

public String getAddress() {
	return secAddress;
}



public String toString(){
return  "Secretary Name: " + secName + "\n Secretary Surname: " + secSurname + "\n Secretary Age: " + secAge  
		 + "\nSecretary PhoneNumber: " +  secPhoneNumber +"\nSecretary Address" + secAddress;
}

}
