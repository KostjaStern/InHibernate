package com.sternkn.inhibernate.entities.im2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TH_IM2_BANK_ACCOUNT")
public class BankAccount extends BillingDetails
{
   private String account;
   private String bankName;
   private String swift;
   
   public BankAccount()
   {
      super();
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
      return "{id: " + getId() + ", owner: " + getOwner() + ", account: " + account + 
              ", bankName: " + bankName + ", swift: " + swift + "}";
   }
}
