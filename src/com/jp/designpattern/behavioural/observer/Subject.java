/**
 * 
 */
package com.jp.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author patejiga
 *
 */
public class Subject {
	int state;
	List<Observer> observers = new ArrayList<>();
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer obs){
		observers.add(obs);
	}
	
	public void notifyAllObservers(){
		for(Observer o : observers){
			o.update();
		}
	}

}
