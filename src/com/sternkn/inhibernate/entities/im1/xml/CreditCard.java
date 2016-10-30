package com.sternkn.inhibernate.entities.im1.xml;

public class CreditCard extends BillingDetails
{
   private Long id;
   private String number;
   private String expMonth;
   private String expYear;
   
   public CreditCard()
   {
   }
   
   public Long getId()
   {
      return id;
   }
   public void setId(Long val)
   {
      id = val;
   }
   
   public String getNumber()
   {
      return number;
   }
   public void setNumber(String val)
   {
      number = val;
   }
   
   public String getExpMonth()
   {
      return expMonth;
   }
   public void setExpMonth(String val)
   {
      expMonth = val;
   }
   
   public String getExpYear()
   {
      return expYear;
   }
   public void setExpYear(String val)
   {
      expYear = val;
   }

   @Override
   public String toString()
   {
      return "{id: " + id + ", owner: " + getOwner() + ", number: " + number + 
             ", expMonth: " + expMonth + ", expYear: " + expYear + "}";
   }
}
