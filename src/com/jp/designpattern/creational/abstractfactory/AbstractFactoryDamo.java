/**
 * 
 */
package com.jp.designpattern.creational.abstractfactory;

/**
 * @author patejiga
 *
 */
public class AbstractFactoryDamo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory fruitFact = FactoryProducer.getFactory("Fruit");
		Fruit mango = fruitFact.createFruit("mango");
		Fruit banana = fruitFact.createFruit("banana");
		mango.print();
		banana.print();
		
		AbstractFactory vegFact = FactoryProducer.getFactory("Veggie");
		Vegetable squash = vegFact.createVeggi("squash");
		Vegetable potato = vegFact.createVeggi("potato");
		squash.echo();
		potato.echo();
	}

}
