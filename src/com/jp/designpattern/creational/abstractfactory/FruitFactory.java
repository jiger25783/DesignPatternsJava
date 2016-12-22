/**
 * 
 */
package com.jp.designpattern.creational.abstractfactory;

/**
 * @author patejiga
 *
 */
public class FruitFactory extends AbstractFactory{
	
	@Override
	public Fruit createFruit(String fruitType){
		if("Mango".equalsIgnoreCase(fruitType)){
			return new Mango();
		} else if("Banana".equalsIgnoreCase(fruitType)){
			return new Banana();
		} 
		return null;
	}
	
	@Override
	Vegetable createVeggi(String vaggiType) {
		System.out.println("cannot create veggi in fruit factory");
		return null;
	}
}
