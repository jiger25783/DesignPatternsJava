/**
 * 
 */
package com.jp.designpattern.creational.singleton;

/**
 * @author patejiga
 *
 */
public class Singleton {
	String value;
	private static Singleton s;
	private Singleton(){
	}
	
	public static Singleton getSingleton(){
		if(s==null){
			s=new Singleton();
		}
		return s;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
