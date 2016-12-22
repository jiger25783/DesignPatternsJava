package com.jp.designpattern.creational.abstractfactory;

public class VegetableFactory extends AbstractFactory{
	@Override
	Fruit createFruit(String fruitType) {
		System.out.println("cannot create fruit in veggei factory");
		return null;
	}
	
	@Override
	Vegetable createVeggi(String vaggiType) {
		if("Potato".equalsIgnoreCase(vaggiType)){
			return new Potato();
		} else if("squash".equalsIgnoreCase(vaggiType)){
			return new Squash();
		}
		return null;
	}
}
