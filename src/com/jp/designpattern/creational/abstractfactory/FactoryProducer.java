/**
 * 
 */
package com.jp.designpattern.creational.abstractfactory;

/**
 * @author patejiga
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factType){
		if("Fruit".equalsIgnoreCase(factType)){
			return new FruitFactory();
		} else if("Veggie".equalsIgnoreCase(factType)){
			return new VegetableFactory();
		}
		return null;
	}
}
