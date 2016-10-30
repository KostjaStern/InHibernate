package com.sternkn.inhibernate.entities.im2.xml;


public abstract class BillingDetails
{
   private Long id;
   private String owner;
   
   public BillingDetails()
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
   
   public String getOwner()
   {
      return owner;
   }
   public void setOwner(String val)
   {
      owner = val;
   }
}
