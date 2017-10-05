package abstractdemo;
//Package is a grouping of related types providing access protection and name 
public class Abstractdemo {        
	//here i have created main class 
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

	public static void main(String[]args){  
		//here i have created main method 
		//Java Program processing starts from the main() method which is a mandatory part of every program 		
		//static used to prepare a field,method or inner classes as a class field.
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
		//String is predefined class name 
		//args is name of the array
		Mobile obj = new AndroidMobile();
		//here we cannot  instantiate the object class
		//so we create object of AndroidMobile which is not an abstract class

		obj.call();
//calling the object
		obj.camera();

		obj.flashlight();

		obj.music();

	}

}

    abstract class Mobile{            //a class is declared as abstract is known as abstract class

    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class

    	public void call(){       //if i have created a method and i have declared it 

    		   System.out.println(" mobile features :calling.........");

    	   }

      public abstract void camera();               //here i have defined the abstract methods  

      public abstract void flashlight();

      public abstract void music();

       }



  class AndroidMobile extends Mobile{   //here i have extended the parent to the child class

	   public void camera(){                                              //here i have implemented them in this class

		   System.out.println("android mobiles has a feature : camera");
		 //System is a final class in java.lang package
			//out is a static member field of system class and it's type PrintStream
			//println is a method of PrintStream class and it means print in next line
			//Inside the brackets is value which to be printed		
			
		   

	   }

	   public  void flashlight(){

		   System.out.println("android mobiles has a another feature : flashlight");  

	   }

	   public  void music(){

		   System.out.println("android mobiles has a one more feature : music");

	   }

   }