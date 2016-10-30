package com.sternkn.inhibernate.entities.im2.xml;

public class BankAccount extends BillingDetails
{
   private String account;
   private String bankName;
   private String swift;
   
   public BankAccount()
   {
   }
   
   public String getAccount()
   {
      return account;
   }
   public void setAccount(String val)
   {
      account = val;
   }   

   public String getBankName()
   {
      return bankName;
   }
   public void setBankName(String val)
   {
      bankName = val;
   }
   
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
