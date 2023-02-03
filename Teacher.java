
public class Teacher {

	
		
// Attributes
String teaName;
String teaSurname;
int teaAge;
String teaPhoneNumber;
String teaAddress;

// Constructor
public Teacher(String sn, String Add, int a, String pn, String n){

this.teaName = n;
this.teaPhoneNumber = pn;
this.teaSurname= sn;
this.teaAge = a;
this.teaAddress = Add;
				  
}

public String getName() {
	return teaName;
	
}

public String getSurname() {
	return teaSurname;
}

public String getAddress() {
	return teaAddress;
	
}


public String toString(){
return  "Teacher Name: " + teaName + "\n Teacher Surname: " + teaSurname + "\n Teacher Age: " + teaAge  
		 + "\nTeacher PhoneNumber: " +  teaPhoneNumber +"\nTeacherAddress" + teaAddress;
}		
		
		
	}	
		
		
		
	