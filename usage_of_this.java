public class Student {
    // variable declarations
    int id; 
    String name;               //instance variables
    String gender = "male";
	
	// Constructors
	Student(int id, String name) {
	    this(name); // Invoking overloaded constructor. If present, should be first statement
	    this.id = id;
	}
	
	Student(String name) {
	    this.name = name;
	}
	
    // method definitions
    boolean updateProfile(String name) {
       this.name = name;  //name used with (this) refers to instance variable
       return true;
    }
	public ststic void main(String[] args)
	{
		Student student1=new Student(1002,"Saurabh");
	    System.out.println("this is the id : " + student1.id);
	}
}