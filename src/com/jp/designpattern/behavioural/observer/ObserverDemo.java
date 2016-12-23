/**
 * 
 */
package com.jp.designpattern.behavioural.observer;

/**
 * @author patejiga
 *
 */
public class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject s = new Subject();
		new BinaryObserver(s);
		new OctalObserver(s);
		System.out.println("Initial state 10");
		s.setState(10);
		System.out.println("Changing state 20");
		s.setState(20);
		

	}

}
