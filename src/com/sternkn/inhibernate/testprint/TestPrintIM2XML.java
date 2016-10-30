package com.sternkn.inhibernate.testprint;

import java.util.List;

import javax.persistence.EntityManager;

import com.sternkn.inhibernate.entities.im2.xml.BankAccount;
import com.sternkn.inhibernate.entities.im2.xml.CreditCard;

public class TestPrintIM2XML
{
   private EntityManager em;
   
   public TestPrintIM2XML(EntityManager manager)
   {
      em = manager;
   }
   
   public void getBillingInfo()
   {
      List billings = em.createQuery("from com.sternkn.inhibernate.entities.im2.xml.BillingDetails bd where bd.owner like 'Mikhail%'").getResultList();
      System.out.println("billings.size() = " + billings.size());
      
      for (Object billing : billings)
      {
        System.out.println("billing = " + billing);
      }
   }
   
   public void saveNewBillings()
   {
      CreditCard creditCard = new CreditCard();
      creditCard.setOwner("Ruslan Ponomariov");
      creditCard.setNumber("1234 4444 5555 6543");
      creditCard.setExpMonth("23/02");
      creditCard.setExpYear("2017");
      em.persist(creditCard);
      
      BankAccount bankAccount = new BankAccount();
      bankAccount.setOwner("Vladimir Kramnik");
      bankAccount.setAccount("DH23F32SD22");
      bankAccount.setBankName("Ukreximbank");
      bankAccount.setSwift("1225");
      em.persist(bankAccount);
   }
}
