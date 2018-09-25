public class Constructor {
    int id;
    String name;
    int salary;
    
    Constructor(int UserId,String UserName)           // constructor overloading
    {
        id=UserId;
        name=UserName;
    }
    
    Constructor(int UserId,String UserName,int UserSalary)   
    {
        this(UserId,UserName);         		 //calling UserId and UserName from above constructor
        salary=UserSalary;             		 //using this  keyword
                                       		 // to make the value of UserId and UserName same throughout
                                      	         //the program
    }
    public static void main(String[] args) {
        Constructor instructor = new Constructor(2001,"Saurabh",100);       //creating object
        System.out.println("user name :" + instructor.name);                //and calling second constructor 
                                                                            //with three parameters
        
        
        // TODO code application logic here
    }
    
 }