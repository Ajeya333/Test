// A simple Java program to demonstrate multiple
// inheritance through default methods.
package com.java.ds;
interface GPI
{
    // default method
    default void show()
    {
        System.out.println("Default GPI");
    }
}
  
interface PI1 extends GPI { 
	default void show()
    {
        System.out.println("Default PI1");
    }
}
  
interface PI2 extends GPI { 
	default void show()
    {
		GPI.super.show();
    }
}
  
// Implementation class code
class InterfaceExamples implements PI1, PI2
{
    public static void main(String args[])
    {
    	InterfaceExamples d = new InterfaceExamples();
        d.show();
    }

	@Override
	public void show() {
		// TODO Auto-generated method stub
		PI1.super.show();
		PI2.super.show();
	}
}