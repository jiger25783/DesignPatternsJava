/**
 * 
 */
package com.jp.designpattern.behavioural.observer;

/**
 * @author patejiga
 *
 */
public class BinaryObserver extends Observer {

	Subject s;
	public BinaryObserver(Subject s) {
		this.s = s;
		s.attach(this);
	}
	/* (non-Javadoc)
	 * @see com.jp.designpattern.behavioural.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Number in binary is:" + Integer.toBinaryString(this.s.getState()));

	}

}
