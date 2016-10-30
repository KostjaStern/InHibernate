package com.sternkn.inhibernate.entities.im1.xml;

public class BankAccount extends BillingDetails
{
   private Long id;
   private String account;
   private String bankName;
   private String swift;
   
   public BankAccount()
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
      return "{id: " + id + ", owner: " + getOwner() + ", account: " + account + 
              ", bankName: " + bankName + ", swift: " + swift + "}";
   }
}
