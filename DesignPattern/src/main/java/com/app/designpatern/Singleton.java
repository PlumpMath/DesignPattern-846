package com.app.designpatern;
/* Step Create Singleton class lazy type 
 * <-----Start --------->
 * creating INSTANCE variable -
Make it private > So that INSTANCE variable cannot be accessed outside class.
Make it static > So that INSTANCE variable can be accessed in static methods of class.
Make it Singleton type> So that INSTANCE variable can be refer to Singleton object.
   
creating private constructor-
Make it private > so that class can't be instantiated outside this class.

 creating getInstance method -
Method which will return instance (only instance) of Singleton class.
 
Method will perform double check and ensure no two threads form more than one instance.

 Method is public so that it could be accessed outside class.
 
Method is static so that it could be accessed without creating instance of class.

 Use synchronized block inside method-so that 2 threads don’t create more than 1 instance of class concurrently.


This is also known as lazy initialization.
 * <-------------END------------------------------------------>
 */
public class Singleton {

	
public static Singleton INSTANCE;	
public static  int i=0;
private Singleton(){
	i=i++;
}
	
	
public static Singleton getInstance(){
	synchronized (Singleton.class) {
		if(INSTANCE==null){
			System.out.println("------"+i);
			INSTANCE=new Singleton(); 
		}
	}	
	return INSTANCE;			
}

public void printString(String param){
	System.out.println("helooooooo>---->::>"+param);
}

	
}
