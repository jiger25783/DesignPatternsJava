/**
 * 
 */
package com.jp.designpattern.creational.abstractfactory;

/**
 * @author patejiga
 *
 */
public abstract class AbstractFactory {
	abstract Fruit createFruit(String fruitType);
	abstract Vegetable createVeggi(String vaggiType);
}
