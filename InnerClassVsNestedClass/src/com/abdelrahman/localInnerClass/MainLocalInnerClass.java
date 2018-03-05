/**
 * 
 */
package com.abdelrahman.localInnerClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 5, 2018
 */
public class MainLocalInnerClass {
	
	private String name = "AbdelrahmanSayed";
	
	public void display(){
		//// this local class must using 
		/// into function 
		class InsideDisplayFunc{
			void display(){
				System.out.println("this is player");
			}

             void showName(){
				System.out.println("Name:"+name);
			}
		}
		InsideDisplayFunc insideDisplayFunc =  new InsideDisplayFunc();
		insideDisplayFunc.display();
		insideDisplayFunc.showName();
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
