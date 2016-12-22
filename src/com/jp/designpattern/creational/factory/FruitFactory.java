/**
 * 
 */
package com.jp.designpattern.creational.factory;

/**
 * @author patejiga
 *
 */
public class FruitFactory {
	public Fruit createFruit(String fruitType){
		if("Mango".equalsIgnoreCase(fruitType)){
			return new Mango();
		} else if("Banana".equalsIgnoreCase(fruitType)){
			return new Banana();
		} 
		return null;
	}
}
