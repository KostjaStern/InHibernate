package com.sternkn.inhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sternkn.inhibernate.testprint.TestPrintIM1;
import com.sternkn.inhibernate.testprint.TestPrintIM1XML;
import com.sternkn.inhibernate.testprint.TestPrintIM2;
import com.sternkn.inhibernate.testprint.TestPrintIM2XML;

public class Main
{
   public static void main(String[] args)
   {
      System.out.println("run ...");
      
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("in-hibernate");
      EntityManager em = emf.createEntityManager();
      EntityTransaction transaction = em.getTransaction(); 
      transaction.begin();

//      TestPrintIM2 testPrint = new TestPrintIM2(em);
//      testPrint.getBillingInfo();
//      testPrint.saveNewBillings();
      
      TestPrintIM2XML testPrint = new TestPrintIM2XML(em);
      testPrint.getBillingInfo();
//      testPrint.saveNewBillings();
      
      transaction.commit();
      em.close();
      emf.close();
      
      System.out.println("done ...");      
   }
}
