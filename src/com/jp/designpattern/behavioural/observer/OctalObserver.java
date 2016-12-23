/**
 * 
 */
package com.jp.designpattern.behavioural.observer;

/**
 * @author patejiga
 *
 */
public class OctalObserver extends Observer {

	Subject s;
	public OctalObserver(Subject s) {
		this.s = s;
		s.attach(this);
	}
	/* (non-Javadoc)
	 * @see com.jp.designpattern.behavioural.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Number in Octal is:" + Integer.toOctalString(this.s.getState()));

	}
}
