package com.sternkn.inhibernate.entities.im1.xml;


public abstract class BillingDetails
{
   private String owner;
   
   public BillingDetails()
   {
   }

   public String getOwner()
   {
      return owner;
   }
   public void setOwner(String val)
   {
      owner = val;
   }
}
