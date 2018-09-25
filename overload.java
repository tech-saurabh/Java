public class overload {
    
    static void varargsOverload(boolean b,int...array)  //creating method with varargs
  {
   System.out.println("inside overload method with varargs \n");   
  
  }

    static void varargsOverload(int i,int j,int l)   //creating method without varargs 
   {
       System.out.println("inside overload method without varargs");
   }

    public static void main(String[] args)   // method overloading and using of varargs in java
 {
         varargsOverload(true,new int[]{2,3,4,5}); //method calling without fixed arguments due to varargs 

         varargsOverload(3,4,6); //method calling with fixed arguments
        
    }
    
}