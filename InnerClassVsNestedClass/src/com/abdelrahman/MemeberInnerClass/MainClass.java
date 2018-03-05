/**
 * 
 */
package com.abdelrahman.MemeberInnerClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 4, 2018
 */

 class A{
	 private String name="Abdelrhman";
	/// this member Calss
	 /// outer class can get inner any access modifier
	 class B{
		 public void dispaly(){
			 System.out.println("name : "+name);
		 }
	 }
 }
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/// must using b through a
       A a = new A();
		A.B b =  a. new B();
		/// or ///
		A.B b2 = new A(). new B();;
		
		b.dispaly();
		b2.dispaly();
	}

}
