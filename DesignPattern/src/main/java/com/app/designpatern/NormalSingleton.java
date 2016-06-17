package com.app.designpatern;

public class NormalSingleton {

	public static NormalSingleton INSTANCE;
	
	
	private NormalSingleton(){
		
	}
	
	public static NormalSingleton getInstance(){
		synchronized (NormalSingleton.class) {
			if(INSTANCE==null){
				INSTANCE=new NormalSingleton();
			}
		}
	
		return INSTANCE;
	}
	
	
	public void printhelo(){
		System.out.println("normal singloton");
	}
}
