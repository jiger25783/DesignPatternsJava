/**
 * 
 */
package com.jp.designpattern.creational.singleton;

/**
 * @author patejiga
 *
 */
public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();
		s.setValue("100");
		Singleton s2 = Singleton.getSingleton();
		s2.setValue("2000");
		System.out.println("S value:" + s.getValue());
		System.out.println("S2 value:" + s2.getValue());
	}

}
