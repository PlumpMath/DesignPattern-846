package com.org.app;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.app.designpatern.Singleton;

import junit.framework.Assert;
import junit.framework.TestCase;
public class SingletonTest extends TestCase {
   private Singleton sone = null, stwo = null;
   private static Logger logger = Logger.getRootLogger();
   public SingletonTest(String name) {
      super(name);
   }
   public void setUp() {
	   String log4jConfPath = "D://new_workspce///DesignPattern//src//test//java//og4j.properties";
	   PropertyConfigurator.configure(log4jConfPath);
      logger.info("getting singleton...");
      sone = Singleton.getInstance();
      logger.info("...got singleton: " + sone);
      logger.info("getting singleton...");
      stwo = Singleton.getInstance();
      logger.info("...got singleton: " + stwo);
   }
   public void testUnique() {
	      Assert.assertEquals(true, sone == stwo);

      logger.info("checking singletons for equality");
      Assert.assertEquals(true, sone == stwo);
   }
}
