package com.app.designpatern;

/**
 * Hello world!
 *
 */
public class App 
{
	public static NormalSingleton singleton;
    public static void main( String[] args ) throws InterruptedException
    {
        singleton = null;
// Both threads call Singleton.getInstance().
Thread threadOne = new Thread(new SingletonTestRunnable()),
       threadTwo = new Thread(new SingletonTestRunnable()),
       threadthree=new Thread(new SingletonTestRunnable());

threadOne.start();
threadTwo.start();
threadthree.start();
threadthree.join();
threadOne.join();
threadTwo.join();
    
    }
    
    
    private static class SingletonTestRunnable implements Runnable {
        public void run() {
           // Get a reference to the singleton.
        	NormalSingleton s = NormalSingleton.getInstance();
        	NormalSingleton s1 = NormalSingleton.getInstance();

           // Protect singleton member variable from
           // multithreaded access.
           synchronized(NormalSingleton.class) {
              if(singleton == null) // If local reference is null...
                 singleton = s; 
              singleton = s1;     // ...set it to the singleton

              // ...set it to the singleton
           }
           
           System.out.println(s.hashCode()+"---------"+singleton.hashCode()+"<---->"+s1.hashCode());
           // Local reference must be equal to the one and
           // only instance of Singleton; otherwise, we have two
                    // Singleton instances.
        }
     }
}
