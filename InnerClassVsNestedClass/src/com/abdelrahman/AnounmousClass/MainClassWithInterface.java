/**
 * 
 */
package com.abdelrahman.AnounmousClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 5, 2018
 */
interface Display{
	public void display();
}
public class MainClassWithInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display() {
			@Override
			public void display() {
				System.out.println("Name : Abdelrahman Sayed");
			}};
display.display();

	}

}
