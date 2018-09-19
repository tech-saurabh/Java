public class student {
                                         //variable declaration
    int id;
    String name;
    String gender;
    
    boolean updateprofile(String newName)     //method to update student name
    {
        name=newName;
        return true;
    } 
    
public static void main(String[] args) {
        // TODO code application logic here
        student s=new student();
        s.id=2001;                           
        s.name="joan";
        s.gender="male";
        s.updateprofile("john");
        System.out.println("id is " + s.id);
        System.out.println("name is  " + s.name);
        System.out.println("gender is  " + s.gender);
    
}
}