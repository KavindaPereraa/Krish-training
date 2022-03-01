package c;
//importing the packages / classes
import b.B;
import a.A;
 
public class Application{
	public static void main(String[] args) //main method 
	{
		B newObj = new B(); //creating an object from the b class
		newObj.run();	//calling the method in the b class
	}

}
