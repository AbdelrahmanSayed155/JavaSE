/**
 * 
 */
package com.abdelrahman.AnounmousClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 4, 2018
 */

abstract class Employee{
	abstract void display();
}
public class MainClass {

	public static void main(String []args){
		/// this is anounymous class 
		Employee employee = new Employee() {
			@Override
			void display() {
				System.out.println("anoun ");
			}
		};
		employee.display();
	}
}
