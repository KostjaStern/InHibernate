package com.sternkn.inhibernate.entities.im2.xml;

public class CreditCard extends BillingDetails
{
   private String number;
   private String expMonth;
   private String expYear;
   
   public CreditCard()
   {
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
      return "{id: " + getId() + ", owner: " + getOwner() + ", number: " + number + 
             ", expMonth: " + expMonth + ", expYear: " + expYear + "}";
   }
}
