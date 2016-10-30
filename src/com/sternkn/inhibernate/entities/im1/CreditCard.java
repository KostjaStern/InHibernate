package com.sternkn.inhibernate.entities.im1;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TH_IM1_CREDIT_CARD")
@AttributeOverride(name="owner", column =
   @Column(name="TH_CRC_OWNER", nullable=false)
)
public class CreditCard extends BillingDetails
{
   private Long id;
   private String number;
   private String expMonth;
   private String expYear;
   
   public CreditCard()
   {
   }
   
   @Id
   @Column(name="TH_CRC_RECID")
   @SequenceGenerator(name="CRC_SEQ", sequenceName="SEQ_TH_IM1_CREDIT_CARD_RECID", allocationSize=1) 
   @GeneratedValue(generator="CRC_SEQ", strategy=GenerationType.SEQUENCE)
   public Long getId()
   {
      return id;
   }
   public void setId(Long val)
   {
      id = val;
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
      return "{id: " + id + ", owner: " + getOwner() + ", number: " + number + 
             ", expMonth: " + expMonth + ", expYear: " + expYear + "}";
   }
}
