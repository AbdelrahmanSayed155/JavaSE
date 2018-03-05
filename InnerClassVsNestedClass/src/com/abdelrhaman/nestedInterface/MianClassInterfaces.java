/**
 * 
 */
package com.abdelrhaman.nestedInterface;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 5, 2018
 */

interface show{
	interface display{
		void display();
	}
}

//// other way
class palying{
	interface show{
		void play();
	}
}
public class MianClassInterfaces implements show.display,palying.show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.abdelrhaman.nestedInterface.show.display#display()
	 */
	@Override
	public void display() {
		System.out.println("Nested Interfaces ");	
	}

	/* (non-Javadoc)
	 * @see com.abdelrhaman.nestedInterface.palying.show#play()
	 */
	@Override
	public void play() {
		System.out.println("Nested Interfaces outer is class ");
		
	}

}
