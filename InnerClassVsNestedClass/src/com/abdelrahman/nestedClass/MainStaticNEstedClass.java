/**
 * 
 */
package com.abdelrahman.nestedClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 5, 2018
 */
public class MainStaticNEstedClass {

	static int age = 12;
	static String name = "AbdelrahmanSayed";
	String address="mohamedAliStreet,Naser City";
	   //// this class using static member only 
	 static class  Subclass{
		public void display(){
			System.out.println("age:"+age);
			/// can't print address it non static System.out.println("address:"+address);
		}
		public static void showInfo(){
			System.out.println("age:"+age+" "+"name:"+name);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainStaticNEstedClass.Subclass sub = new MainStaticNEstedClass.Subclass();
		sub.display();
		
		MainStaticNEstedClass.Subclass.showInfo();
	}

}
