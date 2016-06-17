package com.app.designpatern;

public class AppTest {

	public static void main(String[] args) {
Singleton INSTANCE=Singleton.getInstance();
Singleton INSTANCE1=Singleton.getInstance();
Singleton INSTANCE2=Singleton.getInstance();
INSTANCE.printString("hi");
INSTANCE.printString("hi");

INSTANCE.printString("hi");


System.out.println();
System.out.println(INSTANCE1.hashCode());
System.out.println(INSTANCE2.hashCode());

	}

}
