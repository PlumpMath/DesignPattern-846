package com.app.designpatern;
/*
 * 
 */
public class SinglotonDoubleLocking {
	 //private > So that INSTANCE variable cannot be accessed outside class.
    //static > So that INSTANCE variable can be accessed in static methods of class.
	public static SinglotonDoubleLocking INSTANCE;
	
	private SinglotonDoubleLocking(){
		
	}
	/*
	 *  /**
     * Method which will return instance (only instance) of Singleton class.
     * 
     * Method will perform double check and ensure no two threads form more than one instance.
     * 
     * Method is public so that it could be accessed outside class.
     * 
     * Method is static so that it could be accessed without creating instance of class.
     * 
     * Use synchronized block inside method-so that 2 threads don’t create more 
     * than 1 instance of class concurrently.
	 */
	
	public static SinglotonDoubleLocking getInstance(){
		if(INSTANCE==null){
			synchronized (SinglotonDoubleLocking.class) {
				if(INSTANCE==null){
					INSTANCE=new SinglotonDoubleLocking();
				}
				
			}
		}
		return INSTANCE;	
	}
	
	
}
