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
@Table(name="TH_IM1_BANK_ACCOUNT")
@AttributeOverride(name="owner", column =
   @Column(name="TH_BACC_OWNER", nullable=false)
)
public class BankAccount extends BillingDetails
{
   private Long id;
   private String account;
   private String bankName;
   private String swift;
   
   public BankAccount()
   {
   }
   
   @Id
   @Column(name="TH_BACC_RECID")
   @SequenceGenerator(name="BACC_SEQ", sequenceName="SEQ_TH_IM1_BANK_ACCOUNT_RECID", allocationSize=1) 
   @GeneratedValue(generator="BACC_SEQ", strategy=GenerationType.SEQUENCE)
   public Long getId()
   {
      return id;
   }
   public void setId(Long val)
   {
      id = val;
   }
   
   @Column(name="TH_BACC_ACCOUNT")
   public String getAccount()
   {
      return account;
   }
   public void setAccount(String val)
   {
      account = val;
   }   

   @Column(name="TH_BACC_BANKNAME")
   public String getBankName()
   {
      return bankName;
   }
   public void setBankName(String val)
   {
      bankName = val;
   }
   
   @Column(name="TH_BACC_SWIFT")
   public String getSwift()
   {
      return swift;
   }
   public void setSwift(String val)
   {
      swift = val;
   }

   @Override
   public String toString()
   {
      return "{id: " + id + ", owner: " + getOwner() + ", account: " + account + 
              ", bankName: " + bankName + ", swift: " + swift + "}";
   }
}
