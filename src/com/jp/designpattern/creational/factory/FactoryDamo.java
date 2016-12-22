/**
 * 
 */
package com.jp.designpattern.creational.factory;

/**
 * @author patejiga
 *
 */
public class FactoryDamo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FruitFactory fact = new FruitFactory();
		Fruit mango = fact.createFruit("mango");
		Fruit banana = fact.createFruit("banana");
		mango.print();
		banana.print();
	}

}
