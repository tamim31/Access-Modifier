
package privateAccess;
 class P1 {
    

    private String a;    //in main function it is not accessed.need getter setter method .
	
	P1()
	{
		
	}
	
	P1(String a)
	{
		this.a=a;
	}
	
	public String getA() {     
		return a;
	}


	public void setA(String a) {                     //set method has void return type .
		this.a = a;          
	}

	
	private  double f1;
	
	
	public double getF1() {
		return f1;
	}

	public void setF1(double f1) {
		this.f1 = f1;
	}

	private void display()
	{
		
		System.out.println("private method");
	}

}

