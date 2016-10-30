package com.sternkn.inhibernate.entities.im2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TH_IM2_CREDIT_CARD")
public class CreditCard extends BillingDetails
{
   private String number;
   private String expMonth;
   private String expYear;
   
   public CreditCard()
   {
      super();
   }
   
   @Column(name="TH_CRC_NUMBER")
   public String getNumber()
   {
      return number;
   }
   public void setNumber(String val)
   {
      number = val;
   }
   
   @Column(name="TH_CRC_EXP_MONTH")
   public String getExpMonth()
   {
      return expMonth;
   }
   public void setExpMonth(String val)
   {
      expMonth = val;
   }
   
   @Column(name="TH_CRC_EXP_YEAR")
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
