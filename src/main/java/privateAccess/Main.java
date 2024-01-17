
package privateAccess;
import privateAccess.P1.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		P1 obj=new P1("bushra");
		//P1 obj=new P1();
		
		
		//obj.a="test";   //obj.setA("test")  // here wrong because a is private if we use it as a default then it is working .but it is not good.here we declare a as private but use gatter setter method we need to make it public.
		    //we use getter setter because it protected data integrity.
		
		
		//obj.display();
		
		obj.setA("my name is tamim");
		System.out.println(obj.getA());
		
		obj.setF1(8.999);
		System.out.println(obj.getF1());
		
	}

}