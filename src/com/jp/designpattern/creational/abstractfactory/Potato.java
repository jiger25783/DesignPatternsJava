/**
 * 
 */
package com.jp.designpattern.creational.abstractfactory;

/**
 * @author patejiga
 *
 */
public class Potato implements Vegetable {

	/* (non-Javadoc)
	 * @see com.jp.designpattern.creational.abstractfactory.Vegetable#echo()
	 */
	@Override
	public void echo() {
		System.out.println("Echo: potato");
	}

}
