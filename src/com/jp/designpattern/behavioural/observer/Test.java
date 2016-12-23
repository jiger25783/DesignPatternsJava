package com.jp.designpattern.behavioural.observer;

public class Test {

	public static int var = 5;
	public static void main(String[] args) {
		System.out.println(var);
	}
	static{
		var =15;
		System.out.println("chaning var to 15");
	}
	
}
